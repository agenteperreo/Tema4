package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaración de variables
		int radio, altura; // Base y altura del cilindro
		int opcion; // Opcion para volumen o area

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos la base y la altura
		System.out.print("Dime el radio de la base del cilindro en cm: ");
		radio = sc.nextInt();
		System.out.print("Y dime la altura del cilindro en cm: ");
		altura = sc.nextInt();

		// Menu
		System.out.println("¿Que quieres hacer?");
		System.out.println("1. Area");
		System.out.println("2. Volumen");

		// Pedimos que quiere que mostremos
		opcion = sc.nextInt();

		// Dependiendo de la opción
		switch (opcion) {
		case 1 -> // Si la opcion es 1
			area(radio, altura); // Llamamos a la función area
		case 2 -> // Si la opción es 2
			volumen(radio, altura); // Llamamos a la función volumen
		default -> // Si e otra opción
			System.err.println("ERROR: Opción no valida"); // Mostramos un mensaje de error
		}

		// Cerramos el escaner
		sc.close();

	}

	static void area(int radio, int altura) {
		// Calculamos el area
		double area = 2 * Math.PI * radio * (altura + radio);
		// Mostramos el area
		System.out.printf("El area del cilindro es %.2fcm2", area);
	}

	static void volumen(int radio, int altura) {
		// Calculamos el volumen
		double volumen = Math.PI * radio * radio * altura;
		// Mostramos el volumen
		System.out.printf("El volumen del cilindro es %.2fcm3", volumen);
	}

}
