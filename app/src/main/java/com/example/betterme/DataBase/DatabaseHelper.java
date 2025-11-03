package com.example.betterme.DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.betterme.ClasesConcretas.*;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME  = "BetterMe.db";
    private static final int DATABASE_VERSION = 1;
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }//constructor


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TAREAS = "CREATE TABLE "+Tarea.TABLE_NAME+"("+Tarea.COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+Tarea.COLUMN_NOMBRE+
                " TEXT NOT NULL UNIQUE, "+Tarea.COLUMN_DESCRIPCION+" TEXT, "+Tarea.COLUMN_Cheklist+" INTEGER NOT NULL, "+Tarea.COLUMN_COMPLETADO+
                " INTEGER NOT NULL, "+Tarea.COLUMN_ESTADO+" INTEGER NOT NULL DEFAULT 1)";
        //SQLite no trabaja con Booleanos, por lo cual se usa Integer, siendo 1 verdadero y 0 falso
        db.execSQL(CREATE_TAREAS);//Linea que ejecuta el comando a la BD

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Tarea.TABLE_NAME);
        onCreate(db);
    }
}
