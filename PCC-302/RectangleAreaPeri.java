import java.util.Scanner;

public class RectangleAreaPeri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lenth, width, area, peri;
        System.out.println("Enter the length");
        lenth = sc.nextInt();
        System.out.println("Enter the width");
        width = sc.nextInt();

        area = lenth * width;

        System.out.println("Area is "+area);

        peri = 2 * (lenth + width);

        System.out.println("Perimeter is "+ peri);

    }
}
