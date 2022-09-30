package retangulo;

import java.util.Locale;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Retangulo {

	public Retangulo() {
	}
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double base, altura, area, perimetro, diagonal;
		
		
		System.out.print("Base do retangulo: ");
		double base1 = sc.nextDouble();
		
		System.out.print("Altura do retangulo: ");
		//sc.nextDouble();
		double altura1 = sc.nextDouble();
		
		area 		= base1 * altura1;
		perimetro 	= 2 * (base1 + altura1);
		diagonal 	= Math.sqrt(Math.pow(base1+ 2.0, base1) + Math.pow(altura1 + 2.0, altura1 ));
		
		System.out.println("AREA = " + String.format("%.2f" ,  area));
		System.out.println("AREA = " + String.format("%.2f" ,  perimetro));
		System.out.println("AREA = " + String.format("%.2f" ,  diagonal));

		
			
		
		
		sc.close();
	}

}
