public class SecondsAndMinutes {
    public static void main(String[] args) {
        getDurationString(121,56);
    }

    public static String getDurationString ( int minutes, int seconds) {
            int hourCalc = minutes / 60;
            int minuteCalc = minutes % 60;

        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {

            System.out.println("Your time is " + hourCalc + " hours, " + minuteCalc + " minutes, and " + seconds + " seconds" );

            return "yes";
        } else
            System.out.println("invalid value");
        return "invalid";
    }
}
