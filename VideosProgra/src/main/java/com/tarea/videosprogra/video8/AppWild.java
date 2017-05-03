/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea.videosprogra.video8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toupa
 */
public class AppWild {
    //subclases y si misma
    public void listarUpperBounded(List<? extends Persona> lista){
        for (Persona a: lista){
            System.out.println(a.getNombre());
        }
    }
    //superclases
    public void listarLowerBounded(List<? super Alumno> lista){
        for(Object al: lista){
            System.out.println(((Alumno)al).getNombre());
        }
    }
    public static void main(String[] args) {
        AppWild aw = new AppWild();
        Persona a1 = new Profesor("Pato");
        Alumno a2 = new Alumno("Ale");
        Alumno a3 = new Alumno("Juan");
        
        List<Persona> lista = new ArrayList<>();
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        aw.listarUpperBounded(lista);
        
        Persona p1 = new Persona("Pato2");
        Persona p2 = new Persona("Ale2");
        Persona p3 = new Persona("Juan2");
        List<Persona> lista2 = new ArrayList<>();
        aw.listarLowerBounded(lista2);
    }
}
