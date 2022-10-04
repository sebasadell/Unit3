import java.util.Scanner;

public class Example5 {
    public static void main(String[] argv) {
        float radius;
        float length;
        float area;
        final float PI = (float) 3.14;

        System.out.println("Enter the radius: ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        radius = inputValue.nextFloat();

        length = 2*PI*radius;
        System.out.println("Length: "+length);

        area = PI*radius*radius;
        System.out.println("Area: "+area);
    }
}