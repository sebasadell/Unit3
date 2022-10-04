import java.util.Scanner;

public class Example3 {
    public static void main(String[] argv) {
        float x;
        float squareArea;
        System.out.println("Enter the side: ");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x=inputValue.nextFloat();

        squareArea=x*x;
        System.out.println(squareArea);
    }

}