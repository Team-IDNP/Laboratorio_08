package com.example.laboratorio08;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ReporteAdapter extends RecyclerView.Adapter<ReporteAdapter.ReporteViewHolder> implements Filterable {

    public static class ReporteViewHolder extends RecyclerView.ViewHolder {
        private final TextView departamento;
        private final TextView provincia;
        private final TextView distrito;
        private final ImageView imagen;

        public ReporteViewHolder(View view) {
            super(view);

            departamento = view.findViewById(R.id.txtDepartamento);
            provincia = view.findViewById(R.id.txtProvincia);
            distrito = view.findViewById(R.id.txtDistrito);
            imagen = view.findViewById(R.id.imgReporte);
        }

        public TextView getDepartamento() {
            return departamento;
        }

        public TextView getProvincia() {
            return provincia;
        }

        public TextView getDistrito() {
            return distrito;
        }

        public ImageView getImagen() {
            return imagen;
        }
    }

    public ReporteAdapter(List<Reporte> reportes) {
        this.reportes = reportes;
        this.dataSet = reportes;
    }

    private List<Reporte> dataSet;
    private List<Reporte> reportes;

    @NonNull
    @Override
    public ReporteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);

        return new ReporteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReporteViewHolder holder, int position) {
        Reporte reporte = dataSet.get(position);
        holder.getDepartamento().setText(reporte.getDepartamento());
        holder.getDistrito().setText(reporte.getDistrito());
        holder.getProvincia().setText(reporte.getProvincia());
        holder.getImagen().setBackgroundResource(reporte.getImagen());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    private Filter searchFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            ArrayList<Reporte> listaFiltrada = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                listaFiltrada.addAll(reportes);
            } else {
                String patron = constraint.toString().toLowerCase().trim();

                for (Reporte reporte: reportes)  {
                    if (reporte.getProvincia().toLowerCase().contains(patron)) {
                        listaFiltrada.add(reporte);
                    }
                    if (reporte.getDistrito().toLowerCase().contains(patron)) {
                        listaFiltrada.add(reporte);
                    }
                    if (reporte.getDepartamento().toLowerCase().contains(patron)) {
                        listaFiltrada.add(reporte);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = listaFiltrada;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            dataSet.clear();
            dataSet.addAll((ArrayList<Reporte>) results.values);
            notifyDataSetChanged();
        }
    };

    @Override
    public Filter getFilter() {
        return searchFilter;
    }

}
