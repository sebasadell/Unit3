import java.util.Scanner;

public class Example18 {
    public static void main(String[] argv){
        double price;
        double hours;
        double grossPay;
        double netPay;
        double tax;
        Scanner inputValue;
        System.out.println("Enter the price per hour: ");
        inputValue = new Scanner(System.in);
        price = inputValue.nextFloat();

        System.out.println("Enter the hours: ");
        inputValue = new Scanner(System.in);
        hours = inputValue.nextFloat();

        if (hours<=35) {
            grossPay = price * hours;
            if (grossPay <= 500) {
                netPay = grossPay;
                tax = 0;
            } else {
                double firstSectionGrossPay = grossPay - 500;
                double secondSectionGrossPay = 0;
                if (firstSectionGrossPay > 400) {
                    secondSectionGrossPay = firstSectionGrossPay - 400;
                }
                netPay = 500 + (firstSectionGrossPay * 0.25) + (firstSectionGrossPay * 0.45);
                tax = grossPay - netPay;
            }
        }
        else{
            double extraHours = hours - 35;
            grossPay = hours * 35 + extraHours * 1.5;
            if (grossPay <= 500){
                netPay = grossPay;
                tax = 0;
            }
            else{
                double firstSectionGrossPay = grossPay - 500;
                double secondSectionGrossPay = 0;
                if (firstSectionGrossPay > 400){
                    secondSectionGrossPay = firstSectionGrossPay - 400;
                }
                netPay = 500 + (firstSectionGrossPay * 0.25) + (firstSectionGrossPay * 0.45);
                tax = grossPay - netPay;
            }
        }
        System.out.println("Gross pay is: " + grossPay + "€");
        System.out.println("Net pay is: " + netPay + "€");
        System.out.println("Taxes are: " + tax + "€");
    }
}