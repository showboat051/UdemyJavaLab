package LinkedInJaveEL;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        int result = 10 +12;
        String answer = "The answer is " + result;
        System.out.println(answer);

        String howMany = 20 + " things";
        System.out.println(howMany);

      int result2 = 10 + 20;

        int intValue = 42;
       String fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

      CreateInstancesAndMethods item = new Shirt( "M", 19.99, 3);


        displayItemDetails(item);

        Hat lid1 = new Hat( "M" ,
                            29.99,
                             1);

        displayItemDetails(lid1);

    }


    private static void displayItemDetails(CreateInstancesAndMethods item) {
        double totalPrice = item.getPrice() * item.getQuantity();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String output = String.format("Your %s order will cost %s",
                      item.getType(),
                      formatter.format(totalPrice));
        System.out.println(output);
    }
}
