package com.proyectos.spring.app.models.domain;

public class Producto {

    private String nombre;
    private String memoriaRam;
    private String almacenamiento;
    private String bateria;
    private String SO;
    private String camara;
    private String precio;

    public Producto(String nombre, String memoriaRam, String almacenamiento, String bateria, String SO, String camara, String precio) {
        this.nombre = nombre;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.bateria = bateria;
        this.SO = SO;
        this.camara = camara;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
