/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea.videosprogra.video10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author toupa
 */
public class App {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(12);
        lista.add(1000);
        lista.add(9);
        Collections.sort(lista);
        System.out.println(lista);
    }

}
