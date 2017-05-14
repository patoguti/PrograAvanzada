package com.tarea.videosprogra.video14;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author toupa
 */
public class AppTreeSet {
    public static void main(String[] args) {
//        Set<String> lista = new TreeSet<>();
//        lista.add("MitoCode");
//        lista.add("Mito");
//        lista.add("Code");
//        lista.add("Mito");
//        lista.add("Pato");
//        lista.add("AAA");
//        for(String elemento:lista){
//            System.out.println(elemento);
//        }
        Set<Persona> lista = new TreeSet<>();
        lista.add(new Persona(1, "Mitocode", 22));
        lista.add(new Persona(1, "Mito", 40));
        lista.add(new Persona(1, "Pato", 26));
        lista.add(new Persona(1, "Code", 12));
        lista.add(new Persona(1, "Mitocode", 22));
        lista.add(new Persona(1, "AAA", 2));
        lista.add(new Persona(1, "Mito", 40));
        for(Persona per: lista){
            System.out.println(per.getNombre());
        }
    }
}
