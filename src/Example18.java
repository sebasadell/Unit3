import java.util.Scanner;

public class Example18 {
    public static void main(String[] argv){
        double price;
        double hours;
        double grossPay;
        double netPay;
        double tax;
        Scanner inputValue;

        System.out.println("Enter the hours: ");
        inputValue = new Scanner(System.in);
        hours = inputValue.nextFloat();

        System.out.println("Enter the price per hour: ");
        inputValue = new Scanner(System.in);
        price = inputValue.nextFloat();

        if (hours > 35) {
            grossPay = 35 * price + (hours - 35) * price * 1.5;
        }
        else {
            grossPay = hours * price;
        }
        if (grossPay > 500){
            if (grossPay > 900){
                tax = 400 * 0.25 + (grossPay - 900) * 0.45;
            }
            else{
                tax = (grossPay - 500) * 0.25;
            }
        }
        else {
            tax = 0;
        }
        netPay = grossPay - tax;
        System.out.println("Gross pay is: " + grossPay + "€");
        System.out.println("Taxes are: " + tax + "€");
        System.out.println("Net pay is: " + netPay + "€");
    }
}