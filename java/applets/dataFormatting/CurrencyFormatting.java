import java.util.*;
import java.text.*;

public class CurrencyFormatting {

public static void main(String args[]){
    printCurrency(235.23, "Euros");
    printCurrency(23323.33, "Yen");
    printCurrency(92839283.238, "Dollars");

}
public static void printCurrency(double currencyAmount, String outputCurrency) {
    Locale locale;
		
    if (outputCurrency.equals("Yen")) {
	    locale = new Locale("jp", "JP");
	} else if(outputCurrency.equals("Euros")) {
        locale = new Locale("de", "DE");
	} else if (outputCurrency.equals("Dollars")) {
        locale = new Locale("en", "US");
    } else {
        locale = new Locale("en", "US");
    }
	    
	Currency currency = Currency.getInstance(locale);
	NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
	
	System.out.println(currency.getDisplayName() + ": " + numberFormat.format(currencyAmount)); 

	}
}
