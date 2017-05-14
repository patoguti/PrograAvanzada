package com.tarea.videosprogra.video17;

import java.util.Stack;

/**
 *
 * @author toupa
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        Stack<Persona> pila = new Stack<>();
        pila.push(new Persona(4,"Pato",25));
        pila.push(new Persona(3,"Leo",26));
        pila.push(new Persona(2,"Nacho",27));
        pila.push(new Persona(1,"Vero",28));
        
        for(Persona elem: pila){
            System.out.println(elem);
        }
        System.out.println("Tope: "+pila.peek());
        System.out.println("Search: "+pila.search(new Persona(1,"Vero",28)));
        while(!pila.isEmpty()){
            System.out.println("Atendiendo: "+pila.pop());
            Thread.sleep(1000);
        }
    }
}
