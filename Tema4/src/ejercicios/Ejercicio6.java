package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	static boolean esPrimo(int num) {
		
		//Creamos la variable para saber si es primo
		boolean esPrimo=true;
		
		// Recorremos los números desde 2 hasta número-1
		for (int i = 2; i < num; i++) {
			// Si el número es divisible por i deja de ser primo
			if (num % i == 0) {
				esPrimo=false;
				break;
			}
		}
		
		//Devovlemos la variable al main()
		return esPrimo;
	}

	public static void main(String[] args) {

		// Declaración de variables
		boolean esPrimo;
		int num;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero al usuario
		System.out.print("Dime un numero: ");
		num = sc.nextInt();

		//Llamamos a la funcion esPrimo con el numero como parametro
		esPrimo=esPrimo(num);
		
		//Mostramos si es primo o no
		System.out.println("El numero "+num+(esPrimo==true ? " es primo" : " no es primo"));
		
		//Cerramos el escaner
		sc.close();
	}

}
