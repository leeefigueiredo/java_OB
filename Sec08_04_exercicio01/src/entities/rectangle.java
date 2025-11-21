package entities;

public class rectangle {
	
	public double base;
	public double altura;
	
	public String area() {
		return String.format("%.2f", (base * altura));
	}
	
	public String perimeter() {
		return String.format("%.2f", (2*(base + altura)));
	}
	
	public String diagonal() {
		return String.format("%.2f", 
				(Math.sqrt(Math.pow(base, 2) + Math.pow(altura,2))));
		
	}
	
	

}
