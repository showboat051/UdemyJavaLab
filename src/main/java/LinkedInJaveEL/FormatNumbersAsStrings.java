package LinkedInJaveEL;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormatNumbersAsStrings {

    public static void main(String[] args) {
        double doubleValue = 10_000_000.53;

        NumberFormat numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue));

        // it's rounded
        NumberFormat intF = NumberFormat.getIntegerInstance();
        System.out.println("Number: " + intF.format(doubleValue));

        // Formats currency
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        System.out.println(currencyFormatter.format(doubleValue));

        // adds decimals based on the pattern you set
        DecimalFormat df = new DecimalFormat("$00.00");
        System.out.println(df.format(1));

    }
}
