package org.example.domain;

import java.util.Locale;

public enum Pacientes {
    PACIENTE1("Ana",1),
    PACIENTE2("Juan",2),
    PACIENTE3("Carlos",3),
    PACIENTE4("Maria",4);

    private String nombre;
    private int id;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    Pacientes(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }


}