/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea.videosprogra.video12;



/**
 *
 * @author toupa
 */
public class Persona implements Comparable<Persona> {

    private String nombre;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    private int edad;

    public Persona(int id,String nombre, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Persona p) {
//        return this.edad - p.getEdad();
        return this.nombre.compareTo(p.getNombre());
    }

}
