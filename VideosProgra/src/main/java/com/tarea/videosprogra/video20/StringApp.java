package com.tarea.videosprogra.video20;

/**
 *
 * @author toupa
 */
public class StringApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("pato");
        sb.append("guti");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.reverse());
        
        sb.setLength(0);
        System.out.println(sb.toString());
        //Thread-safe
        StringBuffer sbuf = new StringBuffer();
    }
}
