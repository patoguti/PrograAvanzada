/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea.videosprogra.video7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toupa
 */
public class App {

    public static void main(String[] args) {
        //no necesita castear
        //solo deja agregar Strings
        List<String> lista = new ArrayList();
        lista.add("PatoCode");
//        System.out.println(lista.get(0));
//        lista.add(25);

        
        Clase<String,Integer,String,Double> c = new Clase<>("patoCode",2,"hola",5.3);
        c.mostrarTipo();
        
        
        List<Clase<String,Integer,String,String>> lista2 = new ArrayList<>();
        lista2.add(new Clase<>("Pato",40,"Guti","OK"));
        for(Clase<String,Integer,String,String> cl: lista2){
            cl.mostrarTipo();
        }
    }

}
