/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea.videosprogra.video11;

import java.util.Comparator;

/**
 *
 * @author toupa
 */
public class NombreComparator implements Comparator {

    @Override
    public int compare(Object p1, Object p2) {
        Persona per1 = (Persona) p1;
        Persona per2 = (Persona) p2;
        return per1.getNombre().compareTo(per2.getNombre());

    }

}
