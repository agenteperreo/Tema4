package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	static boolean esPrimo(int div) {
		// Creamos la variable para saber si es primo
		boolean esPrimo = true;

		// Recorremos los números desde 2 hasta número-1
		for (int i = 2; i < div; i++) {
			// Si el número es divisible por i deja de ser primo
			if (div % i == 0) {
				esPrimo = false;
				break;
			}
		}

		// Devovlemos la variable al main()
		return esPrimo;
	}
	
	static int cuentaDivisores(int num) {
		
		//Declaración de variables
		int cont=0;
		boolean esPrimo;
		
		//Recorremos desde el num hasta 1
		for(int i = num; i>0; i--) {
			//Si el modulo de num e i es 0
			if (num%i == 0) {
				//Llamamos a la función esPrimo con i como parametro
				esPrimo=esPrimo(i);
				//Si esPrimo es true
				if(esPrimo) {
					//Añadimos 1 al contador de divisores
					cont++;
				}
			}
		}
		//Devolvemos la cantidad de divisores primos
		return cont;
	}

	public static void main(String[] args) {

		// Declaración de variables
		int num;
		int cantidadDivPrim;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero
		System.out.print("Dime un numero: ");
		num = sc.nextInt();

		// Llamamos a la funcion esPrimo
		cantidadDivPrim = cuentaDivisores(num);

		// Mostramos cuantos divisores primos hay
		System.out.printf("Hay %d divisores primos", cantidadDivPrim);

		// Cerramos el escaner
		sc.close();

	}

}
