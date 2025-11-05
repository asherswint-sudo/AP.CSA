public class Cylinder {
    private double height;
    private Circle base;
    /**
     * Constructor for Cylinder
     * @param r - radius of the base circle
     * @param h - height of the cylinder
     */
     public Cylinder(double r, double h){
        base = new Circle(r);
        height = h;
    }
    /**
     * Calculates the volume of the cylinder
     * @return the volume
     */
    public double volume(){
        double v = height * base.area();
        return v;
    }
    /**
     * Calculates the surface area of the cylinder
     * @return the surface area
     */
    public double surfaceArea(){
        double sa = 2*base.area() + height*base.circumference();
        return sa; 
    }
  
}
