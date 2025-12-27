package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos números você vai digitar? R: ");
		int n = sc.nextInt();
		double vect[] = new double[n];
		double soma = 0;
		
		
		for(int i=0; i<vect.length; i++) {
			System.out.printf("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println(" ");
		
		
		System.out.printf("Valores: ");
		for(int i=0; i<vect.length;i++) {
			System.out.printf(" " + vect[i]);
			soma += vect[i];
			
		}		
		System.out.println();
		System.out.printf("Soma: %.2f%n", soma);
		System.out.printf("Media: %.2f%n", soma / vect.length);
		
		
		sc.close();
		
	}

}
