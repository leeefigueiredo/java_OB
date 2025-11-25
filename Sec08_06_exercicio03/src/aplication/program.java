package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.student;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		student student = new student();
		
		System.out.println("Enter with student name and three grades");
		student.student = sc.nextLine();
		student.n1 = sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();
		
		student.totalNota();
	
		sc.close();

	}

}
