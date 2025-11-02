package com.example.betterme.ClasesConcretas;

public class Tarea {
    private int id;
    private String nombre;
    private String descripcion;
    private boolean Cheklist;
    private boolean completado;

    public Tarea(int id, String nombre, String descripcion, boolean cheklist, boolean completado) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.Cheklist = cheklist;
        this.completado = completado;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public boolean getCheklist() {
        return Cheklist;
    }

    public void setCheklist(boolean cheklist) {
        Cheklist = cheklist;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
