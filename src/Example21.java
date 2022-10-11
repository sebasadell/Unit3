import java.util.Scanner;
class Example21 {
    public static void main(String[] argv) {
        int positives, num;
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        positives = 0;
        for (int i = 0; i < 10; i++) {
            num = inputValue.nextInt();
            if (num >= 0) {
                positives = positives + 1;
            }
        }
        System.out.println(positives + " positives");
    }
}