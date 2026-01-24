package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("quantos números irá digitar: ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("digite um número: ");
			
			int number = sc.nextInt();
			vect[i] = new Product(number);
		}
		
		System.out.println(" ");
		System.out.printf("números pares:");
		System.out.println(" ");
		
		for (int i = 0; i < vect.length; i++) {
			if(vect[i].getNumber() % 2 == 0) {
				System.out.printf(vect[i].getNumber() + " ");	
			}			
			
		}
		
		int soma = 0;
		
		System.out.println(" ");
		
		for (int i = 0; i < vect.length; i++) {
			if(vect[i].getNumber() % 2 == 0) {
				soma ++; 
				
			}			
			
		}
		
		System.out.println(" ");
		System.out.printf("quantidade de pares: " + soma);
		
		sc.close();
	}
}
