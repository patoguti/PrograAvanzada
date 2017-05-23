package com.tarea.videosprogra.video22;

import java.util.regex.Pattern;

/**
 *
 * @author toupa
 */
public class PatternApp {

	public static void main(String[] args) {
		String patron = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		
		long ini = System.currentTimeMillis();
		Pattern p = Pattern.compile(patron);

		
		for(int i = 0; i < 10000;i++){
			String[] arreglo = p.split("Nacho;Banken;Diego;Mati");	
		}
		
		long fin = System.currentTimeMillis();
		
		System.out.println(fin - ini);
		
		////////////////////////////////////
		
		long iniSplit = System.currentTimeMillis();		
		
		for(int i = 0; i < 10000;i++){
			String[] arreglo = "Pato;Leo;Juan;Dewey".split(patron);	
		}
		
		long finSplit = System.currentTimeMillis();
		
		System.out.println(finSplit - iniSplit);
		
		
	}
} 