package util;

public class CurrencyConverter {

	
	public static double dolarConvert(double dollarQuant, double dollarPrice) {
		return  dollarPrice * dollarQuant + (0.06 * (dollarPrice * dollarQuant)) ;
		
	}
	
	
	
	
}
