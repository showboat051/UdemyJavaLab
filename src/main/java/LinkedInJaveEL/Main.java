package LinkedInJaveEL;

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
    }
}
