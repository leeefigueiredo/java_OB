package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		double soma = 0;
		
		Product[] vect = new Product[n];
		

		
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println();
			System.out.printf("Dados " + (i + 1) + "° pessoa:");
			System.out.println();


		    sc.nextLine(); // limpa o buffer do nextInt anterior
			System.out.printf("Nome: ");
			String name = sc.nextLine();

			System.out.printf("Idade: ");
			int idade = sc.nextInt();

			System.out.printf("altura: ");
			double altura = sc.nextDouble();

			vect[i] = new Product(name, idade, altura);

		}

		
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getAltura();
		}
		
		
		System.out.println(" ");
		System.out.printf("Media idade %.2f%n", (soma / vect.length));

	
		double menos16 = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				menos16 += 1;
			}	
		
		}
		
		System.out.println("Pessoas com menos de 16 anos: " + (menos16/vect.length)*100 + "%");
		
	
		
		for (int i = 0; i < vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println(vect[i].getName());				
			}	
		
		}

		sc.close();
	}
}
