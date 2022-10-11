import java.util.Scanner;

public class Example30 {
    public static void main(String[] argv){
        int x;
        Scanner inputValue;
        System.out.println("Enter a number:");
        inputValue = new Scanner(System.in);
        x = inputValue.nextInt();

        for(int i = 1; i <= x; i++){
            System.out.println(i);
        }
    }
}
