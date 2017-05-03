/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea.videosprogra.video4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toupa
 */
public class App {
    private static final List canasta = new ArrayList();
    public static void main(String[] args) {
        String texto = new String("Hola, mundo");
        if(texto instanceof String){
            System.out.println("Es un String");
        }

        Alumno al = new Alumno();
        if (al instanceof Alumno) {
            System.out.println("Es un alumno");
        }
        if (al instanceof Persona) {
            System.out.println("Es una persona");
        }
        
       
        Manzana m1 = new Manzana("ROJA");
        Manzana m2 = new Manzana("VERDE");
        Naranja n1 = new Naranja("NARANJA SIN PEPA");
        Galleta g1 = new Galleta("CHOCOLATE");
        verificar(m1);
        verificar(m2);
        verificar(n1);
        verificar(g1);
        
    }
    private static void verificar(Object object){
        if (object instanceof Fruta){
            canasta.add(object);
            System.out.println(((Fruta) object).getNombre()+" agregada");
        }else{
            System.out.println(object.getClass().getSimpleName()+" no es una fruta");
        }
    }
}
