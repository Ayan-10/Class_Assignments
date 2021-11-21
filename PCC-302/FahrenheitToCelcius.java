import java.util.Scanner;

/**
 * FahrenheitToCelcius
 */
public class FahrenheitToCelcius {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahren, cel;

        System.err.println("Enter temperature in Fahrenheit scale");
        fahren = sc.nextDouble();

        cel = (fahren - 32) / 1.8;
        System.err.println("Temperature in Celcius scale is "+cel+"°");

    }
}