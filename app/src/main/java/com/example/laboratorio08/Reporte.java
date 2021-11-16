package com.example.laboratorio08;

public class Reporte {

    private String departamento;
    private String provincia;
    private String distrito;
    private boolean estado;
    private String imagen;

    public Reporte(String departamento, String provincia, String distrito, boolean estado, String imagen) {
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
