import java.util.Scanner;

public class Example7 {
    public static void main(String[] argv) {
        float distanceNautical;
        float distanceMeter;
        final float Nautical = 1852;
        System.out.println("Enter the distance in nautical miles:");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        distanceNautical = inputValue.nextFloat();

        distanceMeter = distanceNautical*Nautical;
        System.out.println("Distance in meters: "+distanceMeter+"m.");
    }
}