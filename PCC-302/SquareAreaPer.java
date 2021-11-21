import java.util.Scanner;

public class SquareAreaPer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int side, area, peri;
        System.out.println("Enter the side");
        side = sc.nextInt();

        area = side * side;

        System.out.println("Area is "+area);

        peri = 4 * side;

        System.out.println("Perimeter is "+ peri);
    }
}
