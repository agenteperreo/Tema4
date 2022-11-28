package sobrecarga;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static double media(int a, int b) {
		double res=(double)(a+b)/2;
		return res;
	}
	
	public static double media(int a, int b, int c) {
		double res=(double)(a+b+c)/3;
		return res;
	}

	public static void main(String[] args) {
		
		//Declaracion de variables
		int num1, num2, num3;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos 2 numeros
		System.out.println("Dime 2: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		//Mostramos la media de los 2 anteriores
		System.out.printf("La media es %.2f\n",media(num1,num2));
		
		//Pedimos 3 numeros
		System.out.println("Dime 3: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		//Mostramos la media de los 3 anteriores
		System.out.printf("La media es %.2f",media(num1,num2,num3));
		
		//Cerramos el escaner
		sc.close();
	}

}
