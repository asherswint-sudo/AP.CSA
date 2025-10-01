public class Cylinder {
    private double height;
    private Circle base;

     public Cylinder(double r, double h){
        base = new Circle(r);
        height = h;
    }

    public double volume(){
        double v = height * base.area();
        return v;
    }

    public double surfaceArea(){
        double sa = 2*base.area() + height*base.circumference();
        return sa; 
    }
  
}
