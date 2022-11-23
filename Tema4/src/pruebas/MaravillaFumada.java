package pruebas;

public class MaravillaFumada {

		static int esPrimo(int num) {
			int cont=0;
			boolean esPrimo=true;
			
			for(int i=num; i>0; i--) {
				if (num%i==0) {
					for (int j=2; j<i ;j++) {
						if(i%j==0) {
							esPrimo=false;
							break;
						}
					}
					if (esPrimo) {
						cont++;
					}
				}
			}
			return cont;
		}


}
