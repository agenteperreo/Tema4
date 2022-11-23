package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	static int max(int num1, int num2) {		
		//si num1 es mayor que num2
		if (num1>num2) {
			return num1; //Devolvemos num1
		} else { //Si no 
			return num2; //Devolvemnos num2
		}
		
	}

	public static void main(String[] args) {
		
		//Declaración de variables
		int num1, num2, max;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los 2 numeros
		System.out.println("Dime 2 numeros: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		//Llamamos a la funcion max con num1 y num2
		max=max(num1, num2);
		
		//Mostramos cual es el numero mas alto
		System.out.printf("El numero mas alto es %d",max);
		
		//Cerramos el escaner
		sc.close();

	}

}
