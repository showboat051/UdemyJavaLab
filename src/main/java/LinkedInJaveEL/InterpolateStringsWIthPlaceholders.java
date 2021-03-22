package LinkedInJaveEL;

public class InterpolateStringsWIthPlaceholders {
    public static void main(String[] args) {
        String item = "Shirt";
        String size = "M";
        double price = 14.99;
        String color = "Red";

        String template = "Clothing item: %s, size %s, color %s, $%.2f";
        String itemString = String.format(template, item, size, color, price);
        System.out.println(itemString);
    }
}
