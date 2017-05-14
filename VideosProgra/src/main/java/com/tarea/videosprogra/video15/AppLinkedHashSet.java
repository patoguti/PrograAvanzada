package com.tarea.videosprogra.video15;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author toupa
 */
public class AppLinkedHashSet {
    public static void main(String[] args) {
        Set<Persona> lista = new LinkedHashSet<>();
        lista.add(new Persona(1, "Mitocode", 22));
        lista.add(new Persona(1, "Mito", 40));
        lista.add(new Persona(1, "Pato", 26));
        lista.add(new Persona(1, "Code", 12));
        lista.add(new Persona(1, "Mitocode", 25));
        lista.add(new Persona(1, "AAA", 2));
        lista.add(new Persona(1, "Mito", 40));
        for(Persona per: lista){
            System.out.println(per.getNombre());
        }
    }
}
