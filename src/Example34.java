import java.util.Scanner;

public class Example34 {
    public static void main(String[] argv){
        int n;
        float e = 0;
        Scanner inputValue;
        System.out.println("Enter a number:");
        inputValue = new Scanner(System.in);
        n = inputValue.nextInt();

        for (int i = 0; i <= n; i++){
            float factorial = 1;
            for (int j = 1; j <= i; j++){
                 factorial= factorial * j;
            }
            e = e + 1/factorial;
        }
        System.out.println(e);
    }
}