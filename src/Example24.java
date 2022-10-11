import java.util.Scanner;

public class Example24 {
    public static void main(String[] argv) {
    int num;
    int factorial = 1;
    Scanner inputValue;
    System.out.println("Enter a number to calculate its factorial:");
    inputValue = new Scanner(System.in);
    num = inputValue.nextInt();

    for (int i = 1; i <= num; i++){
        factorial = factorial * i;
    }
    System.out.println(num + "! = " + factorial);
    }
}