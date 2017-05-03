/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea.videosprogra.video5;

/**
 *
 * @author toupa
 */
public class App {
    public static void main(String[] args) {
//        PaisDAOImpl dao = new PaisDAOImpl();

//        Patron singleton
        PaisDAOImpl dao = PaisDAOImpl.getInstance();
        for(Object obj: dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }
        System.out.println("-----");
        for(Object obj: dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }
        PaisDAOImpl dao2 = PaisDAOImpl.getInstance();
         for(Object obj: dao2.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }
    }
    
}
