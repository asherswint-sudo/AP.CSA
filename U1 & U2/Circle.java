public class Circle {
    private double radius;
    /**
     * Constructor for Circle
     * @param r - radius of the circle
     */
    public Circle(double r){
        radius = r;
    }

    /**
     * Calculates the area of the circle
     * @return the area
     */

    public double area(){
        double a = Math.PI*Math.pow(radius, 2);
        return a;
    }

    /**
     * Calculates the circumference of the circle
     * @return the circumference
     */
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

// 78.53981633974483
// 31.41592653589793