import java.util.Scanner;

public class Example32 {
    public static void main(String[] argv){
        double x;
        double y;
        Scanner inputValue;
        System.out.println("Enter a number:");
        inputValue = new Scanner(System.in);
        x = inputValue.nextFloat();

        double n = x;
        for (int i = 1; i <= 10; i++){
            y = 0.5*(x+(n/x));
            x = y;
        }
        System.out.println("The square root of " + n + " is: " + x);
    }
}
