package a4;

class Sphere1 {

    private double r;

    public Sphere1(double r){
        this.r = r;
        System.out.println("Wonder of Objects");
    }

    public void findArea(){
        System.out.println("Surface Area = "+4*Math.PI*r*r);
    } 
    public void findVolume(){
        System.out.println("Volume = "+(4*Math.PI*r*r*r)/3);
    }
    
}

public class Test2ND3 {

    public static void main(String[] args) {
        Sphere1 s2 = new Sphere1(2);

        s2.findArea();
        s2.findVolume();
        Sphere1 s3 = new Sphere1(2);
    }
}
// Wonder of Objects
// Surface Area = 50.26548245743669
// Volume = 33.510321638291124
// Wonder of Objects
