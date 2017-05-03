/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea.videosprogra.video7;
/**
 *
 * @author toupa
 */
public class Clase<K,T,V,E> {
    private K objetoK;
    private T objetoT;
    private V objetoV;
    private E objetoE;

    public Clase(K objetoK, T objetoT, V objetoV, E objetoE) {
        this.objetoK = objetoK;
        this.objetoT = objetoT;
        this.objetoV = objetoV;
        this.objetoE = objetoE;
    }
    
    public void mostrarTipo() {
        System.out.println("K es un " + objetoK.getClass().getSimpleName());
        System.out.println("T es un " + objetoT.getClass().getSimpleName());
        System.out.println("V es un " + objetoV.getClass().getSimpleName());
        System.out.println("E es un " + objetoE.getClass().getSimpleName());
    }
}
