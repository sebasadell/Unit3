import java.util.Scanner;

public class Example15 {
    public static void main(String[] argv) {
        int mark;

        System.out.println("Enter the mark of the exam:");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        mark = inputValue.nextInt();

        if (mark >= 0 && mark < 3) {
            System.out.println("Muy Deficiente");
        }

        if (mark >= 3 && mark < 5) {
            System.out.println("Insuficiente");
        }

        if (mark >= 5 && mark < 6) {
            System.out.println("Suficiente");
        }

        if (mark >= 6 && mark < 7) {
            System.out.println("Bien");
        }

        if (mark >= 7 && mark < 9) {
            System.out.println("Notable");
        }

        if (mark >= 9 && mark <= 10) {
            System.out.println("Sobresaliente");
        }
    }
}