package com.tarea.videosprogra.video19;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author toupa
 */
public class DequeApp {

    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("1-pato");
        dq.add("2-leo");
        dq.add("3-juan");
        String x = dq.peek();
        System.out.println("Peek: " + x);

        x = dq.poll();
        System.out.println("Poll: " + x);

        x = dq.pop();
        System.out.println("Pop: " + x);
        
        dq.addFirst("0-dewey");
        dq.addLast("4-vero");
        for(String elem: dq){
            System.out.println(elem);
        }
    }
}
