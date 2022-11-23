package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	static double calculadora(int num1, int num2, int opc) {
		double res = 0;

		switch (opc) {
		case 1 -> res = num1 + num2;
		case 2 -> res = num1 - num2;
		case 3 -> res = num1 * num2;
		case 4 -> res = (double)num1 / num2;
		default -> System.err.println("ERROR: Opción no valida");

		}

		return res;
	}

	public static void main(String[] args) {

		// Declaración de variables
		int num1, num2, opcion;
		double res;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos los 2 numeros
		System.out.println("Dime 2 numeros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		// Mostramos un menu
		System.out.println("------------------");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multilicar");
		System.out.println("4. Dividir");
		System.out.println("------------------");

		// Pedimos que quiere hacer
		System.out.print("¿Que quieres hacer?: ");
		opcion = sc.nextInt();

		// Llamamos a la funcion calculador con num1, num2 y la opcion como parametro
		res = calculadora(num1, num2, opcion);

		// Si el la opcion es 1, 2, 3 o 4
		if (opcion == 1 || opcion == 2 || opcion == 3) {
			// Mostramos el resultado
			System.out.printf("El resultado es %.0f", res);
		} else if(opcion==4) {
			System.out.printf("El resultado es %.2f", res);
		}

		// Cerramos el escaner
		sc.close();
	}

}
