package LinkedInJaveEL;

import java.util.Scanner;

public class ScannerUse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number");
        int input = scan.nextInt();
        System.out.println("Your number is " + input);


        System.out.println("Enter the 1st Number");
        double dblInput1 = scan.nextDouble();
        System.out.println("Enter the 2nd Number");
        double dblInput2 = scan.nextDouble();
        double result = dblInput1 / dblInput2;
        System.out.println("The Result is : " + result);


    }
}
