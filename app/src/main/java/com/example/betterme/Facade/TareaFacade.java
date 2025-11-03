package com.example.betterme.Facade;
import com.example.betterme.ClasesConcretas.Tarea;
import com.example.betterme.ClasesConcretas.Tarea;
public class TareaFacade {

    public void crear(int id,String nombre, String descripcion, boolean checklist, boolean compleatado,
                      boolean estado) {
        Tarea tarea = new Tarea(id,nombre,descripcion,checklist,compleatado,estado);
    }

    public void actualizar() {

    }

    public void leer() {

    }

    public void buscarPorNombre() {

    }

    public void eliminar() {

    }
}
