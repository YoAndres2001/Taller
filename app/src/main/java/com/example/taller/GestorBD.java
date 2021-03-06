package com.example.taller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class GestorBD extends SQLiteOpenHelper {

    String table_users = "CREATE TABLE users(id int primary key, email text, password text)";
    String table_tasks = "CREATE TABLE tasks(id int primary key, user_id int, title text, description text, priority int, state text)";

    public GestorBD(@Nullable Context context, @Nullable String name,
                    @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(table_users);
        db.execSQL(table_tasks);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
