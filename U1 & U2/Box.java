public class Box {
    // attributes
    private double height;
    private double width;
    private double length;
    private String color;
    private boolean hasALid;
    /*
     * Constructor - sets all of the attributes
     */
    public Box (double h, double w, double l, String c, boolean lid){
        height = h;
        length = l;
        width = w;
        color = c;
        hasALid = lid;
    }

    public Box (double h, double l, double w){
        height = h;
        length = l;
        width = w;
        color = "brown";
        hasALid = false;
        
    }

    public double getHeight(){
        return height;
    }

    public String toString(){
        String s = "A box with dimensions " + height + " " + length + " " + width + " ";
        s += " Its color is " + color + " and it has a lid? " + hasALid;
        return s;
    }
    public void setHeight(double h){
        height = h;
    }

    public String getColor() {
        return color;
    }

    /*
     * Default contructor
     */
    public Box(){
        height = 1.0;
        length = 1.0;
        width = 1.0;
        color = "brown";
        hasALid = false;
    }

    public double getVolume(){
        double v =  length*width*height;
        return v;
    }

    public static void main(String[] args) {
        Box b1 = new Box(5.4, 8.3, 2.7, "red", true); 
        Box b2 = new Box(4.6, 2.2, 7.8);
        double h = b1.getHeight();
        System.out.println(h);
        b1.setHeight(7.5);
        System.out.println(b1.getHeight());

        int x = 5;
        String name = "Howdy Doody";
        System.out.println(x);
        System.out.println(name);
        System.out.println(b1);
        System.out.println(b2);
    }
}