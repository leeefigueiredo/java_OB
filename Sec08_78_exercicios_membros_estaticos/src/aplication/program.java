package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class program {

	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("What is the dollar price?");
		
		double dollarPrice = sc.nextDouble();
		
		
		System.out.println("How many dollars will be bought?");
		
		double dollarQuant = sc.nextDouble();
		
		
		double dollarTotal = CurrencyConverter.dolarConvert(dollarQuant, dollarPrice);
		
		
		System.out.println("Total: " + dollarTotal);
		
		
		
		
		sc.close();
		
	}

	
	
	
}
