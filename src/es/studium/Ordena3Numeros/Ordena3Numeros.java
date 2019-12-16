package es.studium.Ordena3Numeros;

import java.util.Scanner;

public class Ordena3Numeros {

	public static void main(String[] args) 
	{
		int a, b, c;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número a: ");
		a = teclado.nextInt();
		System.out.println("Dame un número b: ");
		b = teclado.nextInt();
		System.out.println("Dame un número c: ");
		c = teclado.nextInt();
		if(a<=b&&b<=c) 
		{
			System.out.println("El mayor es " + c + " seguido de " + b + " 	siendo el menor el " + a);
			
		}
		else if(a<=c&&c<=b) 
		{
			System.out.println("El mayor es " + b + " seguido de " + c + " siendo el menor el " + a);
		} 
		else if(b<=a&&a<=c) 
		{
			System.out.println("El mayor es " + c + " seguido de " + a + " siendo el menor el " + b);
		}
		else if(b<=c&&c<=a) 
		{
			System.out.println("El mayor es " + a + " seguido de " + c + " siendo el menor el " + b);
		}
		else if(c<=a&&a<=b) 
		{
			System.out.println("El mayor es " + b + " seguido de " + a + " siendo el menor el " + c);
		}
		else if(c<=b&&b<=a) 
		{
			System.out.println("El mayor es " + a + " seguido de " + b + " siendo el menor el " + c);
		}
		teclado.close();

	}

}
