package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	static boolean esVocal(String c) {
		boolean esVocal;
		
		switch(c) {
		case "a", "e", "i", "o", "u" ->
			esVocal=true;
		default -> 
			esVocal=false;
		}
		
		return esVocal;
	}

	public static void main(String[] args) {
		
		//Declaracion de variables
		String carac;
		boolean vocal;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el caracter al usuario
		System.out.print("Escribe una letra: ");
		carac=sc.nextLine();
		
		//Llamamos a la función esVocal
		vocal=esVocal(carac);
		
		//Mostramos si es una vocal o no
		System.out.println(vocal==true ? "Es una vocal" : "No es una vocal");
		
		//Cerramos el escaner
		sc.close();

	}

}
