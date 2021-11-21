package a4;

/**
 * q1
 */
class Sphere {

    double r;
    double xc;
    double yc;
    
    public Sphere(double r, double xc, double yc){
        this.r = r;
        this.xc = xc;
        this.yc = yc;
    }

    public Sphere() {
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setXc(double xc) {
        this.xc = xc;
    }

    public void setYc(double yc) {
        this.yc = yc;
    }
    
    public void display(){
        System.out.println("Radius "+r+" Coordinates "+ xc+","+yc);
    }
}
public class Test1 {

    public static void main(String[] args) {
        Sphere s1 = new Sphere();

        s1.setR(2.5);
        s1.setXc(4);
        s1.setYc(2);
        s1.display();

        Sphere s2 = new Sphere(3.5, 2, 2);

        s2.display();
        
    }
}
// Radius 2.5 Coordinates 4.0,2.0
// Radius 3.5 Coordinates 2.0,2.0