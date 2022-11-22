package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
	static void eco(int numVeces) {
		//Mostramos Eco... la cantidad de veces que hemos introducido por parametros
		for(int i=0; i<numVeces; i++) {
			System.out.println("Eco...");
		}
	}
	
	public static void main(String[] args) {
		
		//Declaración de variables
		int num; //Numero de veces que se va a escribir Eco...
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el numero al usuario
		System.out.print("Dime una cantidad: ");
		num=sc.nextInt();
		
		//Llamamos a la funcion eco
		eco(num);
		
		//Cerramos el escaner
		sc.close();

	}
	


}
