import java.util.Scanner;

/**
 * TakaToPaisa
 */
public class TakaToPaisa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price;
        int paisa;

        System.out.println("Enter the price");
        price = sc.nextDouble();

        paisa = (int) (price * 100);

        System.out.println("Price "+ price +" equal to "+ paisa + " paisa");

    }

    void ppp(){

    }

}