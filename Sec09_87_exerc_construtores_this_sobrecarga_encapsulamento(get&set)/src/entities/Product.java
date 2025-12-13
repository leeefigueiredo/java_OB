package entities;

public class Product {

	private int number;
	private String name;
	private double balance;
	
	
	public Product(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}

	public Product(int number, String name) {
		this.number = number;
		this.name = name;
	}

	
	
	public int getNumber() {
		return number;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	public void initialBalanceYes(String yn,double balance) {
	        
			this.balance = balance;
	        System.out.println("");
	        System.out.println("Acount data: ");
	        System.out.println("Account: " + this.number + ", Holder: " + this.name + ", Balance:" + this.balance);
	        
	    } 
	
	public void initialBalanceNo(String yn) {
	        this.balance = 0;
	        System.out.println("");
	        System.out.println("Acount data:");
	        System.out.println("Account: " + this.number + ", Holder: " + this.name + ", Balance: $" + this.balance);
	    }


	public double deposit(double depositValue) {
		return this.balance += depositValue;
		
	}
	
	public double withdraw(double withdrawValue) {
		return this.balance -= withdrawValue + 5;
	}
	
	public void update() {
		System.out.println("UPDATE ACCOUNT DATA:");
		 System.out.println("Account:  " + this.number + ", Holder: " + this.name + ", Balance: $ " + this.balance);
	}
	
	
}
