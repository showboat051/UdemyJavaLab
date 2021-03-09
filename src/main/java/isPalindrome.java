import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        isPalindrome(234);
    }
    
    public static boolean isPalindrome (int number) {

//        Scanner numScan = new Scanner(System.in);
//        System.out.println("Enter your number");
//        numScan.nextInt();

        int reversedNum = 0;

        while(number !=0) {
            int digit = number % 10;
            reversedNum = reversedNum * 10 + digit;
            number /= 10;
        System.out.println(number);
        }
        System.out.println("The original is " + number);
        System.out.println(reversedNum);
            if(number == reversedNum) {
        System.out.println("The reverse of " + number + " is now " + reversedNum);
                return true;
            } else {
                return false;
            }

    } // isPalindrome
}
