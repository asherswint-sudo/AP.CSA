public class Circle {
    private double radius;

    public Circle(double r){
        radius = r;
    }

    public double area(){
        double a = Math.PI*Math.pow(radius, 2);
        return a;
    }

    public double circumference(){
        double c = 2*Math.PI*radius;
        return c;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1.area());
        System.out.println(c1.circumference()); 
    }

    public double getRadius() {
    return radius;
    }
}
