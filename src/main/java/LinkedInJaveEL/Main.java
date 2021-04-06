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

      CreateInstancesAndMethods item = new CreateInstancesAndMethods();
      item.setType("Shirt");
      item.setSize("M");
      item.setPrice(19.99);
      item.setQuantity(3);

      double totalPrice = item.getPrice() * item.getQuantity();
      NumberFormat formatter = NumberFormat.getCurrencyInstance();
      String output = String.format("Your %s order will cost %s",
                    item.getType(),
                    formatter.format(totalPrice));
        System.out.println(output);

    }
}
