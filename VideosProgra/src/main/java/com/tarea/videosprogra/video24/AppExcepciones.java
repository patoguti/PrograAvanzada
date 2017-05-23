package com.tarea.videosprogra.video24;

import java.io.IOException;

/**
 *
 * @author toupa
 */
public class AppExcepciones {

	public void mostrar() {
		try {
			throw new IOException("IOException");
		} catch (NullPointerException | IOException | NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void main(String[] args) {
		AppExcepciones app = new AppExcepciones();
		app.mostrar();
	}
} 