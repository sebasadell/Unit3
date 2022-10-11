import java.util.Scanner;

public class Example29 {
    public static void main(String[] argv){
        int x;
        int y;
        int remainder = 0;

        Scanner inputValue;
        System.out.println("Enter the first number:");
        inputValue = new Scanner(System.in);
        x = inputValue.nextInt();
        if (x < 0){
            System.out.println("Error");
        }else{
            System.out.println("Enter the second number:");
            inputValue = new Scanner(System.in);
            y = inputValue.nextInt();
            if (y < 0){
                System.out.println("Error");
            }else{
                if (x > y){
                    remainder = x - y;
                    while (remainder >= y){
                        remainder = remainder - y;
                    }
                    System.out.println("The remainder of the division of " + x + " and " + y + " is: " + remainder);
                }

                if (x < y) {
                    remainder = y - x;
                    while (remainder >= x) {
                        remainder = remainder - x;
                    }
                    System.out.println("The remainder of the division of " + y + " and " + x + " is: " + remainder);
                }
            }
        }

    }
}
