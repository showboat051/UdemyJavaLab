public class SalaryCalculator {
    public static double calcSalary (int hrsWorked, double hrRate, int daysPerWeek) {
        double result = hrsWorked * hrRate * daysPerWeek ;
        return result;
    }

    public static void main(String[] args) {
        double displayResult = calcSalary(40, 17, 5);
        System.out.println(displayResult + " is the weekly salary BEFORE taxes");
    }
}
