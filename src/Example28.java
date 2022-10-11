import java.util.Scanner;

public class Example28 {
    public static void main(String[] argv){
        int x;
        int y;
        int sum = 0;

        Scanner inputValue;
        System.out.println("Enter the first number:");
        inputValue = new Scanner(System.in);
        x = inputValue.nextInt();
        if (x < 0){
            System.out.println("Error:");
        }

        System.out.println("Enter the second number:");
        inputValue = new Scanner(System.in);
        y = inputValue.nextInt();
        if (y < 0){
            System.out.println("Error:");
        }

        for (int i = 1; i <= x; i++){
            sum = sum + y;
        }
        System.out.println("The multiplication of " + x + " and " + y + " is: " + sum);
    }
}
