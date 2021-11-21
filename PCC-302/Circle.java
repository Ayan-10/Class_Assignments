import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int radius;
        double area, peri;
        System.out.println("Enter the radius");
        radius = sc.nextInt();

        area = Math.PI * ( radius * radius );

        System.out.println("Area is "+area);

        peri = 2 * Math.PI * radius;

        System.out.println("Perimeter is "+ peri);
    }
}
