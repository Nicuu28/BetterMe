package com.example.betterme.ClasesConcretas;

public class Tarea {

    //Inicio datos para la Base de datos
    public static final String TABLE_NAME = "Tareas";
    public static final String COLUMN_ID="id";
    public static final String COLUMN_NOMBRE="nombre";
    public static final String COLUMN_DESCRIPCION="descripcion";
    public static final String COLUMN_Cheklist="checklist";
    public static final String COLUMN_COMPLETADO="completado";
    public static final String COLUMN_ESTADO="estado";
    //Fin datos para la Base de datos

    private int id;
    private String nombre;
    private String descripcion;
    private boolean Cheklist;
    private boolean completado;
    private boolean estado;

    public Tarea(int id, String nombre, String descripcion, boolean cheklist, boolean completado, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.Cheklist = cheklist;
        this.completado = completado;
        this.estado=estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCheklist() {
        return Cheklist;
    }

    public void setCheklist(boolean cheklist) {
        Cheklist = cheklist;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
