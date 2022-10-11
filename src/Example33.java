import java.util.Scanner;

public class Example33 {
    public static void main(String[] argv){
        double x;
        double y = 0;
        Scanner inputValue;
        System.out.println("Enter a number:");
        inputValue = new Scanner(System.in);
        x = inputValue.nextFloat();

        double n = x;
        double z = 1;
        while ( z >= 0.000001 ){
            y = 0.5*(x+(n/x));
            z = x - y;
            x = y;
        }
        System.out.println("The square root of " + n + " is: " + x);
    }
}