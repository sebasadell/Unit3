import java.util.Scanner;

public class Example25 {
    public static void main(String[] argv) {
        int num;
        Scanner inputValue;
        System.out.println("Enter a number to calculate its table:");
        inputValue = new Scanner(System.in);
        num = inputValue.nextInt();

        for (int i = 0; i <= 10; i++){
            int product  = num * i;
            System.out.println(num + " * " + i + " = " + product);
        }
    }
}