import java.util.Scanner;

public class Example31 {
    public static void main(String[] argv){
        int x;
        Scanner inputValue;
        System.out.println("Enter a number:");
        inputValue = new Scanner(System.in);
        x = inputValue.nextInt();

        for (int i = 1; i <= x; i++){
            for (int j = x; j > i; j--){
                System.out.print("/ ");
            }
            for (int j = i; j > 1; j--){
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            for (int j = x; j > i; j--){
                System.out.print("/ ");
            }
            System.out.println();
        }
    }
}