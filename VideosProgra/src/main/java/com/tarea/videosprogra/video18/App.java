package com.tarea.videosprogra.video18;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author toupa
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        Queue<Persona> cola = new PriorityQueue<>();
        cola.offer(new Persona(4,"Pato",29));
        cola.offer(new Persona(3,"Leo",26));
        cola.offer(new Persona(2,"Nacho",27));
        cola.offer(new Persona(1,"Vero",28));

        while(!cola.isEmpty()){
            System.out.println("Atendiendo: "+cola.poll());
            Thread.sleep(1000);
        }
    }
}
