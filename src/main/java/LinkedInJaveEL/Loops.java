package LinkedInJaveEL;

public class Loops {

    public static void main(String[] args) {
        String[] months = {
                "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

//        for (int mo = 0; mo < months.length;  mo++) {
//            System.out.println(months[mo]);
//        }


                //For Each
//        for (String month : months) {
//            System.out.println(month);
//        }
//
//        int whileCounter = 0;
//        while( whileCounter < months.length) {
//            System.out.println(months[whileCounter]);
//            whileCounter++;
//        }

        int doCounter = 0;
        do {
            System.out.println(months[doCounter]);
            doCounter++;
        }
        while( doCounter < months.length);
    }
}
