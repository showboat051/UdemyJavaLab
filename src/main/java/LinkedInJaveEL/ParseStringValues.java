package LinkedInJaveEL;

public class ParseStringValues {

    public static void main(String[] args) {
        String s1 = "Welcome to California!";
        System.out.println("The length is " + s1.length());


        int position = s1.indexOf("California");
        System.out.println("The position is " + position);

        // Starts at the string until it ends
        String sub = s1.substring(11);
        System.out.println(sub);

        String s2 = "Welcome!          ";
        int len = s2.length();
        System.out.println("S2 lenght is : " + len);

        //Trim() eliminates the white space
        String trimmed = s2.trim();
        System.out.println("This is s2 now trimmed === " + trimmed);
    }
}
