package com.example.betterme.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

import com.example.betterme.ClasesConcretas.Tarea;
import com.example.betterme.DataBase.DatabaseHelper;

import java.util.Collections;
import java.util.List;

public class TareaDAO{
    private DatabaseHelper dbHelper;
    private static final String CREAR = "INSERT INTO" + Tarea.TABLE_NAME + " ( " + Tarea.COLUMN_NOMBRE +
            Tarea.COLUMN_DESCRIPCION + Tarea.COLUMN_Cheklist + Tarea.COLUMN_COMPLETADO +
            " ) VALUES (?,?,?,?)";
    private static final String ELIMINAR = "DELETE FROM "+Tarea.TABLE_NAME+" WHERE "+Tarea.COLUMN_ID+" = ?";

    public void crear(Tarea tarea) {
            SQLiteDatabase db = null;
            SQLiteStatement statement = null;
            try {
                db = dbHelper.getWritableDatabase();

                statement.bindString(1, tarea.getNombre());
                statement.bindString(2, tarea.getDescripcion());
                statement.bindLong(3, tarea.isCheklist() ? 1 : 0);
                statement.bindLong(4, tarea.isCompletado() ? 1 : 0);
        }catch (Exception e){
                e.printStackTrace();
            }finally {
                if(statement != null) statement.close();
                if (db != null) db.close();
            }
    }

    public List<Object> leer() {
        return Collections.emptyList();
    }

    public void buscarPorNombre(String nombre) {

    }

    public void eliminar(int id) {
        SQLiteDatabase db = null;
        SQLiteStatement statement = null;
        try {
            db = dbHelper.getWritableDatabase();
            statement.bindLong(1,id);
            statement.executeUpdateDelete();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(statement != null) statement.close();
            if (db != null) db.close();
        }

    }
}
