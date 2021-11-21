package a4;

class Rock{

    private int m;
    public Rock(int m){

        this.m = m;
    }

    public int getM() {
        return m;
    }
}

public class Test5 {
    public static void main(String[] args) {

        Rock[] arr = {new Rock(4), new Rock(5), new Rock(6), new Rock(9), new Rock(8), new Rock(1), new Rock(2),
            new Rock(3), new Rock(7), new Rock(4)};

            int sum = 0;
        for(int i=0; i<10; i++){
            sum += arr[i].getM();
            System.out.println(arr[i].getM());
        }    
        System.out.println("Total mass "+sum);
    }
}
// 4
// 5
// 6
// 9
// 8
// 1
// 2
// 3
// 7
// 4
// Total mass49
