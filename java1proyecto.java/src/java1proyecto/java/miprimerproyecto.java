package java1proyecto.java;

import java.util.Scanner;

public class miprimerproyecto {

	static final float PI=(float)3.14;
	static final int MAXELEMENTOS=10;
	static final String APODO= "D";
	static Scanner teclado = new Scanner(System.in);
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x;
		int num;
		Double num1;
		char letra;
		
		
		
		x=PI*3;
		
		System.out.println("Hola Mundo");
		System.out.println("El valor de x es:" + x +" y se acabo");
		System.out.println("Introduce un numero");
		num = Integer.parseInt(teclado.nextLine());
		System.out.println("El numero que acabas de introducir es " + num);
		System.out.println("Introduce un numero");
		num1 = Double.parseDouble(teclado.nextLine());
		System.out.println("El numero que acabas de introducir es " + num1);
		System.out.println("Introduce una letra");
		letra = teclado.nextLine().charAt(0);
		System.out.println("La letra que acabas de introducir es " + letra);
		

	}

}
