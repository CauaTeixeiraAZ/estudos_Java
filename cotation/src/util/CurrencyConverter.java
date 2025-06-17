package util;

public class CurrencyConverter {
	public static double cotation;
	public static double dolar;
	
	public static double converter(){
		double reais = dolar * cotation ;
		return reais -= (dolar / 100 * 6);
	}
}
