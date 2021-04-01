package LinkedInJaveEL;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NewCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        String op = null;
        try {
            System.out.println("Enter a number");
            num1 = input.nextInt();
            input.nextLine();
            System.out.println("Enter a number");
            num2 = input.nextInt();
            input.nextLine();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Could not read as a number");
            return;
        }
            System.out.println("Select an Operation ( + - * /");
            op = input.nextLine();

            int calc = 0;
        switch (op) {
            case "+":
                 calc = num1 + num2;
                break;
                case "-": 
                    calc = num1 - num2;
                break;
                case "*": 
                    calc = num1 * num2;
                break;
                case "/":
                 calc = num1 / num2;
                break;
            default:
                System.out.println("Ok, what are we doing here?");
        }

        System.out.println(" The answer is " + calc);



    } // end of main


}
