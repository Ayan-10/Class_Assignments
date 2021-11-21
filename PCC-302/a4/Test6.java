package a4;



public class Test6 {
    public static void main(String[] args) {
        
        display();
        display("twice");
        display("thrice", 3);
        
    }
    public static void display() {
            System.out.println("Welcome to JAVA");
    }

    public static void display(String s) {
        System.out.println("Welcome to polymorphism");
        System.out.println("Welcome to polymorphism");
    }
    public static void display(String s, int n) {
        System.out.println("Welcome to overloading");
        System.out.println("Welcome to overloading");
        System.out.println("Welcome to overloading");
    }
}
// Welcome to JAVA
// Welcome to polymorphism
// Welcome to polymorphism
// Welcome to overloading
// Welcome to overloading
// Welcome to overloading