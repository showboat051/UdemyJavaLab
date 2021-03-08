public class ForLoopPractice {
    public static void main(String[] args) {


//            for (int i = 2; i< 9; i++) {
//            System.out.println("The interest is " + i + calcInterest(10000, 2) );
//
//            }



        int count = 0;
        for ( int  i =1; i<50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
//                if(count == 3) {
//                    System.out.println("Exiting loop");
//                    break;
//                }
            }
        }

    }

    public static double calcInterest(double amt, double intRate) {
        double resInt = (amt * (intRate/100));
        return resInt;
    }

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if (n % i ==0) {
//                System.out.println(n);
                return false;
            }
        }
        return true;
    }
}
