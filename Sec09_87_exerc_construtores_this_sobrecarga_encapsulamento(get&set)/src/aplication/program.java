package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		String name;
		String yn;
		double balance;
		
		
		
		System.out.printf("Enter account number: ");
		number = sc.nextInt();
		
		System.out.printf("Enter account holder: ");
		sc.nextLine();
		name = sc.nextLine();
		
		Product product = new Product(number, name);
		
		System.out.printf("Is there an initial desposit (y/n):");
		yn = sc.nextLine();
		
		if(yn.equalsIgnoreCase("y")) {
			System.out.printf("Enter initial deposit value: ");
			balance = sc.nextDouble();
			product.initialBalanceYes(yn, balance);
		} else if (yn.equalsIgnoreCase("n")) {
			product.initialBalanceNo(yn);
		}
		
		System.out.println(" ");
		System.out.printf("Enter deposit value: ");
		double depositValue = sc.nextDouble();
		product.deposit(depositValue);
		product.update();
		
		System.out.println(" ");
		System.out.printf("Enter withdraw value: ");
		double withdrawValue = sc.nextDouble();
		product.withdraw(withdrawValue);
		product.update();
		
		
		sc.close();
}
}