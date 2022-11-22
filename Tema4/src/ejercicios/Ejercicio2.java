package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Declaración de variables
		int num1, num2; //Numeros introducidos por el usuario
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los 2 numeros al usuario
		System.out.print("Dime un numero: ");
		num1=sc.nextInt();
		System.out.print("Dime otro: ");
		num2=sc.nextInt();
		
		//Llamamos a la funcion con los numeros como parametro de entrada
		entreNumeros(num1, num2);
		
		//Cerramos el escaner
		sc.close();

	}
	
	static void entreNumeros(int num1, int num2) {
		//Variables para saber  cual es mayor y menor
		int mayor, menor;
		
		//Comprobamos quien es el mayor y quien el menor
		if(num1>num2) {
			mayor=num1;
			menor=num2;
		} else {
			mayor=num2;
			menor=num1;
		}
		
		//Mostramos i mientras i sea menor o igual al mayor
		for(int i=menor+1; i<mayor; i++) {
			System.out.println(i);
		}
	}

}
