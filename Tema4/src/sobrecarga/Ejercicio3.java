package sobrecarga;

import java.util.Scanner;

public class Ejercicio3 {
	
	static int sumaEnteros(int a) {
		//Declaración de variables
		int suma=0;
		
		//Sumamos i a la variable suma hasta a
		for (int i=1; i<=a; i++) {
			suma+=i;
		}
		
		//Devolvemos la variable suma
		return suma;
	}
	
	static int sumaEnteros(int a, int b) {
		
		//Declaración de variables
		int suma=0;
		int mayor, menor;
		
		//Comprobamos quien es mayor
		if (a>b) {
			mayor=a;
			menor=b;
		} else {
			menor=a;
			mayor=b;
		}
		
		for(int i=menor; i<=mayor; i++) {
			suma+=i;
		}
		
		//Devolvemos la suma
		return suma;
	}

	public static void main(String[] args) {
		
		//Declaración de variables 
		int num1, num2;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos un numero
		System.out.print("Dime un numero: ");
		num1=sc.nextInt();
		
		//Mostramos la funcion
		System.out.printf("La suma desde 1 hasta %d es %d\n",num1,sumaEnteros(num1));
		
		//Pedimos 2 numeros
		System.out.println("Dime 2 numeros: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		//Mostramos el resultado 
		System.out.printf("La suma desde %d hasta %d es %d",num1,num2,sumaEnteros(num1, num2));
		
		//Cerramos el escaner
		sc.close();

	}

}
