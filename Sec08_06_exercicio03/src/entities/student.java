package entities;

public class student {

	public String student;
	public double n1;
	public double n2;
	public double n3;
	
	public void totalNota() {
		if((n1 + n2 + n3) > 60.00) {
			System.out.println(student + " - FINAL GRADE = %.2f" + (n1 + n2 + n3));
			System.out.println("PASS");
		} else {
			System.out.println(student + " - FINAL GRADE = " + (n1 + n2 + n3));
			System.out.println("FAILED");
			System.out.println("MISSING " + (60 - (n1 + n2 + n3)) + " POINTS");
		};
		
	}
	
}
