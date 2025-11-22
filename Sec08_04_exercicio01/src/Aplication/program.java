package Aplication;


import java.util.Locale;
import java.util.Scanner;

import entities.rectangle;

public class program {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	rectangle rectangle = new rectangle();
	
	System.out.println("Enter rectangle width and height");
	rectangle.altura = sc.nextDouble();
	rectangle.base = sc.nextDouble();
	System.out.println("AREA = " + rectangle.area());
	System.out.println("PERIMETER = " + rectangle.perimeter());
	System.out.println("DIAGONAL = " + rectangle.diagonal());
	
	
	
	sc.close();

	}

}
