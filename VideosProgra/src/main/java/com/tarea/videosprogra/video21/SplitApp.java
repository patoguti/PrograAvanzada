package com.tarea.videosprogra.video21;

/**
 *
 * @author toupa
 */
public class SplitApp {

    public static void main(String[] args) {
        String cadena = "Pato|guti|123";
        String split[] = cadena.split("\\|",2);

        for (String elem : split) {
            System.out.println(elem);
        }
    }
}
