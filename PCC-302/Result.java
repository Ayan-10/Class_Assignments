import java.util.Scanner;

/**
 * Result
 */
public class Result {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
   
        // Character input
        char n = sc.next().charAt(0);
        char res = '$';

        if ((n >= 65 && n <= 90) || (n >= 97 && n <= 122)){
            char temp = Character.toLowerCase(n);
            switch (temp) {
                case 'a': 
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    res = 'v';
                    break;
                default:
                    res = 'c';
                    break;
            }
        } else if (n >= 48 && n <= 57) {
            res = 'd';
        }
        
        switch (res) {
            case 'v':
                System.out.println(n + " is vowel");
                break;

            case 'c':
                System.out.println(n + " is consonant");
                break;  

            case 'd':
                System.out.println(n + " is digit");
                break;  

            default:
                System.out.println(n + " is special character");
                break;
        }
    }
}