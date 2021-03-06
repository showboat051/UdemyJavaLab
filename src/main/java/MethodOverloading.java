public class MethodOverloading {
    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(6, -5);
    }

    public static double calcFeetAndInchesToCentimeters (int feet, int inches) {
        if (feet >= 0 && inches >=0 && inches <=12) {

            double feetCalc = feet * 30.48;
            double inchCalc = inches * 2.54;
            System.out.println( feetCalc + inchCalc);
            return feetCalc + inchCalc;
        } else
            System.out.println("Invalid");
            return -1;



    }

    public static double calcFeetAndInchesToCentimeters (int inches) {
        if (inches >= 0) {
            System.out.println(inches * 2.54);
            return inches * 2.54;
        } else
            System.out.println("Invalid");
        return -1;
    }
}
