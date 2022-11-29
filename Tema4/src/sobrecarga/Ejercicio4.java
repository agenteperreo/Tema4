package sobrecarga;

import java.util.Scanner;

public class Ejercicio4 {

	static boolean parseToBoolean(int a) {

		// Declaración de variables
		boolean bool = a == 0 ? false : true;

		// devolvemos la variable
		return bool;
	}
	
	static boolean parseToBoolean(String palabra) {
		
		//Si la palabra es false es false si no true
		boolean bool= palabra.equals("false") ? false : true;
		
		//Devolvemos  la variable
		return bool;
	}

	public static void main(String[] args) {

		// Declaración de variables
		int num;
		String bolean;

		// Abrimos el escaner
		Scanner scan = new Scanner(System.in);
		
		//Pedimos el numero
		System.out.print("Dime 1 o 0: ");
		num = scan.nextInt();

		// Pedimos el numero hasta que sea 0 o 1
		while (num != 1 && num != 0) {
			System.out.print("Dime 1 o 0: ");
			num = scan.nextInt();
		}
		
		//Mostramos si es true o false
		System.out.println(parseToBoolean(num));
		
		// Pedimos la palabra
		System.out.println("true o false: ");
		bolean=scan.next();
		
		//Pedimos la palabra hasta que sea true o false
		while(!bolean.equals("true") && !bolean.equals("false")) {
			System.out.println("true o false: ");
			bolean=scan.next();
		}
		
		//Mostramos si es true o false
		System.out.println(parseToBoolean(bolean));
		
		//Cerramos el escaner
		scan.close();

	}

}
