package sobrecarga;

import java.util.Scanner;

/**
 * En esta clase pediremos al usuario la cantidad de numeros aleatorios que
 * quiere generar y su rango y lo generaremos.
 * 
 * @author igarcia
 *
 */

public class Ejercicio5 {

	/**
	 * En esta funcion generaremos una cierta cantidad de numeros aleatorios que
	 * recibiremos del usuario.
	 * 
	 * @param a Cantidad de numeros aleatorios a generar
	 */
	static void numerosAleatorios(int a) {

		// Generamos a numeros aleatorios
		for (int i = 0; i < a; i++) {
			System.out.printf("%.2f\n", (double) (Math.random()));
		}

	}

	/**
	 * En esta funcion generaremos una cierta cantidad de numeros aleatorios con un
	 * numero maximo enviados por el usuario
	 * 
	 * @param a Cantidad de numeros aleatorios a generar
	 * @param b Numero maximo del numero aleatorio
	 */
	static void numerosAleatorios(int a, int b) {

		// Generamos a numeros aleatorios entre 0 y b
		for (int i = 0; i < a; i++) {
			System.out.println((int) (Math.random() * b) + 1);
		}

	}

	/**
	 * En esta clase generaremos una cierta cantidad de numeros aleatorios con un
	 * rango pedido por el usuario
	 * 
	 * @param a Cantidad de numeros aleatorios a generar
	 * @param b Numero maximo de los numeros aleatorios
	 * @param c Numero minimo de los numeros aleatorios
	 */
	static void numerosAleatorios(int a, int b, int c) {

		// Generamos a numeros aleatorios entre b y c
		for (int i = 0; i < a; i++) {
			System.out.println((int) (Math.random() * (b - c + 1) + c));
		}

	}

	/**
	 * En la clase main pediremos los parametros al usuario y llamaremos a las
	 * correspondientes clases
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Declaración de variables
		int cantNum, valMax, valMin;

		// Abrimos el escaner
		Scanner scan = new Scanner(System.in);

		// Pedimos la cantidad de numeros aleatorios que quiere generar
		System.out.print("¿Cuantos numeros aleatorios quieres generar?: ");
		cantNum = scan.nextInt();

		// Llamamos a la función con la cantidad como parametro
		numerosAleatorios(cantNum);

		// Pedimos cantidad y numero maximo
		System.out.print("¿Cuantos numeros quieres generar?: ");
		cantNum = scan.nextInt();
		System.out.print("¿Cual va a ser el numero maximo?: ");
		valMax = scan.nextInt();

		// Llamamos a la función con la cantidad y el valor maximo como parametro
		numerosAleatorios(cantNum, valMax);

		// Pedimos la cantidad, numero maximo y numero minimo
		System.out.print("¿Cuantos numeros quieres generar?: ");
		cantNum = scan.nextInt();
		System.out.print("¿Cual va a ser el numero maximo?: ");
		valMax = scan.nextInt();
		System.out.print("¿Cual va a ser el numero minimo?: ");
		valMin = scan.nextInt();

		// Llamamos a la función con la cantidad, el valor maximo y el valor minimo como
		// parametro
		numerosAleatorios(cantNum, valMax, valMin);

		// Cerramos el escaner
		scan.close();

	}

}
