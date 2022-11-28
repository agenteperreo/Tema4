package sobrecarga;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static int suma(int a, int b) {
		return a+b;
	}
	
	public static double suma(double a, double b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		//Declaración de variables
		int num1, num2;
		double num3, num4;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los 2 numeros enteros
		System.out.println("Dime 2 numeros enteros: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		//Pedimos los 2 numeros decimales
		System.out.println("Dime 2 numeros y no tienen porque ser enteros: ");
		num3=sc.nextDouble();
		num4=sc.nextDouble();
		
		//Mostramos las sumas y los resultados llamando en el resultado a cada funcion
		System.out.printf("La suma de %d y %d es %d\nLa suma de %.2f y %.2f es %.2f",num1,num2,suma(num1, num2),num3,num4,suma(num3,num4));
		
		//Cerramos el escaner
		sc.close();
	}

}
