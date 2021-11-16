package com.example.laboratorio08;

import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ReporteAdapter extends RecyclerView.Adapter<ReporteAdapter.ReporteViewHolder> {

    public static class ReporteViewHolder extends RecyclerView.ViewHolder {
        private final TextView departamento;
        private final TextView provincia;
        private final TextView distrito;
        private final Image imagen;

        public ReporteViewHolder(View view) {
            super(view);

            departamento = view.findViewById(-1);
            provincia = view.findViewById(-1);
            distrito = view.findViewById(-1);
            imagen = view.findViewById(-1);
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

        public Image getImagen() {
            return imagen;
        }
    }

    public ReporteAdapter(List<Reporte> reportes) {
        this.reportes = reportes;
    }

    private List<Reporte> reportes;

    @NonNull
    @Override
    public ReporteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) -{
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout._, parent, false);

        return new ReporteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReporteViewHolder holder, int position) {
        Reporte reporte = reportes.get(position);
        holder.getDepartamento().setText("" + reporte.getDepartamento());
        holder.getDistrito().setText("" + reporte.getDistrito());
        holder.getProvincia().setText("" + reporte.getProvincia());
        // TODO: Falta agregar una imagen
    }

    @Override
    public int getItemCount() {
        return reportes.size();
    }

}
