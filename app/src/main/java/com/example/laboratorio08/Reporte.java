package com.example.laboratorio08;

import androidx.annotation.DrawableRes;

public class Reporte {

    private String departamento;
    private String provincia;
    private String distrito;
    private boolean estado;
    @DrawableRes
    private int imagen;

    public Reporte(String departamento, String provincia, String distrito, boolean estado, int imagen) {
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.estado = estado;
        this.imagen = imagen;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
