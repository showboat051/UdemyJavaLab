package LinkedInJaveEL;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Map Example

        Map<String, CreateInstancesAndMethods> thingsMap = new HashMap<>();
        thingsMap.put("shirt", new Shirt( "M", 19.99, 3) );
        thingsMap.put("hat" , new Hat( "M" ,
                29.99,
                1));

        CreateInstancesAndMethods anItem = thingsMap.get("hat");
        displayItemDetails(anItem);
        // using a list for an array
        List<String> colorsList = new ArrayList<>();
        colorsList.add("red");
        colorsList.add("greem");
        colorsList.add("blue");
/*
        for (int i = 0; i < colorsList.size(); i++) {
            System.out.println("the list " + colorsList.get(i));
        }
*/


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

        // using List for objects
        List<CreateInstancesAndMethods> thingsList = new ArrayList<>();
        thingsList.add( new Shirt( "Ledium", 89.99, 1));
                thingsList.add(new Hat( "M" ,
                        29.99,
                        1));
        
       CreateInstancesAndMethods[] things = {
               new Shirt( "M", 19.99, 3),
               new Hat( "M" ,
                       29.99,
                       1)
       };
    // for each loop
        for (CreateInstancesAndMethods uniqueItem : thingsList) {
            displayItemDetails(uniqueItem);
        }

     

/*
        String[] colors = new String[3];
        colors[0] = "Red";
        colors[1] = "Green";
        colors[2] = "Blue";
*/

/*
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
*/

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
