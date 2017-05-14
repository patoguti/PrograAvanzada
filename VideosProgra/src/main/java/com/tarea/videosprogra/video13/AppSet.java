package com.tarea.videosprogra.video13;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author toupa
 */
public class AppSet {

    public static void main(String[] args) {
//        Set<String> lista = new HashSet<>();
//        lista.add("MitoCode");
//        lista.add("Mito");
//        lista.add("Code");
//        lista.add("MitoCode");
//        for(String elemento: lista){
//            System.out.println(elemento);
//        }
        Set<Persona> lista = new HashSet<>();
        lista.add(new Persona(1, "Mitocode", 22));
        lista.add(new Persona(1, "Mito", 22));
        lista.add(new Persona(1, "Code", 22));
        lista.add(new Persona(1, "Code", 22));
        lista.add(new Persona(1, "Mitocode", 22));
        lista.add(new Persona(1, "AAA", 22));
        for (Persona elemento : lista) {
            System.out.println(elemento.getNombre());
        }
    }
}
