/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea.videosprogra.video11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author toupa
 */
public class App {

    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona(2,"Leo",22));
        lista.add(new Persona(1,"Pato",20));
        lista.add(new Persona(3,"Juan",24));
        Collections.sort(lista,new NombreComparator());
        for (Persona p: lista){
        System.out.println(p.getNombre());
        }
        System.out.println("---------------");
        Collections.sort(lista,new Comparator<Persona>(
        ) {
            @Override
            public int compare(Persona p1, Persona p2) {
                if(p1.getEdad()>p2.getEdad()){
                    return 1;
                }else if(p1.getEdad()< p2.getEdad()){
                    return -1;
                }
                return 0;
                
            }
        });
        for (Persona p: lista){
        System.out.println(p.getNombre());
        }
        
        
    }

}
