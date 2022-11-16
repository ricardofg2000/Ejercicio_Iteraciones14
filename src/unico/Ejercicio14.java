package unico;

import java.util.Scanner;

public class Ejercicio14 {
	

	public static void main(String[] args) {
		/*
		Pedir un número n y dibujar un triángulo rectángulo 
		de n elementos de lado, utilizando para ello asteriscos (*).

		Por ejemplo, para n=4:
		
		* * * *
		* * *
		* *
		*
		
		*/
		
		Scanner leer = new Scanner (System.in);
		
		int n = 0;
		
		System.out.print("Introduzca el tamaño del triángulo: ");
		n = Integer.parseInt(leer.nextLine());
		System.out.println();
		
		for (int f=1; f<=n;f++) {
			for (int c=1; c<=n-f+1; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
}
