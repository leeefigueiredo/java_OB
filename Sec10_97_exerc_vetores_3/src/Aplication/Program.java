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
		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println(" ");
			System.out.printf("Dados " + (i + 1) + "° pessoa:");
			System.out.println(" ");

			System.out.printf("Nome: ");
			String name = sc.nextLine();

			sc.nextLine();
			System.out.printf("Idade: ");
			int idade = sc.nextInt();

			System.out.printf("altura: ");
			double altura = sc.nextDouble();

			vect[i] = new Product(name, idade, altura);

		}

		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getAltura();
		}
		System.out.println(" ");
		System.out.printf("Media idade %.2f%" + soma / vect.length);

		sc.close();
	}
}
