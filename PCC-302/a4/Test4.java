package a4;

class Test4 {
    public static void main(String[] args) {
        for (String string : args) {
            if(string.toLowerCase().equals("uno")){
                System.out.println("One");
            } else if(string.toLowerCase().equals("dos")){
                System.out.println("Two");
            } else if(string.toLowerCase().equals("tres")){
                System.out.println("Three");
            } else if(string.toLowerCase().equals("quarto")){
                System.out.println("Four");
            } else if(string.toLowerCase().equals("cinco")){
                System.out.println("Five");
            }  
        }
    }
}
// javac Test4.java
// java Test4.java uno noooo
// shhh
// nooo