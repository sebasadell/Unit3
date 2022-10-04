import java.util.Scanner;

public class Example4 {
    public static void main(String[] argv) {
        float x;
        float y;
        float sum;
        float subtraction;
        float multiplication;
        float division;

        System.out.println("Enter the first number: ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextFloat();

        System.out.println("Enter the second number: ");
        inputValue = new Scanner(System.in);
        y = inputValue.nextFloat();

        sum = x+y;
        System.out.println(x+" + "+y+" = "+sum);

        subtraction = x-y;
        System.out.println(x+" - "+y+" = "+subtraction);

        multiplication = x*y;
        System.out.println(x+" * "+y+" = "+multiplication);

        division = x/y;
        System.out.println(x+" / "+y+" = "+division);
    }
}