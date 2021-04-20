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
        
       CreateInstancesAndMethods[] things = {
               new Shirt( "M", 19.99, 3),
               new Hat( "M" ,
                       29.99,
                       1)
       };

        for (CreateInstancesAndMethods item : things) {
            displayItemDetails(item);
        }

     

        String[] colors = new String[3];
        colors[0] = "Red";
        colors[1] = "Green";
        colors[2] = "Blue";

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

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
