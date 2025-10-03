/*
 * A line segment is defined by 2 endpoints
 * Each endpoint is a Point object
 */

public class Line {
    private Point end1;
    private Point end2;
// Contructs a line with endpoint corrdinates
// param x1 - x coord of endpoint 1
// param y1 - y coord of endpoint 1
// param x2 - x coord of endpoint 2
// param y2 - y coord of endpoint 2
    public Line(double x1, double y1, double x2, double y2)
    {
        end1 = new Point(x1,y1);
        end2 = new Point(x2, y2);
    }
    public Line()		// default constructor
    {
        end1 = new Point();
        end2 = new Point();
    }
    // Calculates the distance between the 2 endpoints
    // return the distance between end1 and end2
    public double distance()
    {
        double d = Math.sqrt(Math.pow((end2.getX() - end1.getX()), 2) + Math.pow((end2.getY() - end1.getY()), 2));
        return d;
    }
    // calculates the midpoint of the line segment
    // return the midpoint as a Point object
    public Point midpoint(){
        double midX = (end1.getX() + end2.getX()) / 2;
        double midY = (end1.getY() + end2.getY()) / 2;
        return new Point(midX, midY);
    }
    // calculates the slope of the line segment
    // return the slope
    public double slope()
    {
        double m = (end2.getY()-end1.getY())/(end2.getX()-end1.getX());
        return m;
    }
    // Returns a lines endpoints as a string
    public String toString()
    {
        String s = "Line with endpoints " + end1 + " and " + end2;
        return s;
    }
    // Determines if 2 lines are parallel
    // param otherLine - the other line to compare to
    // return true if the lines are parallel, false otherwise
    public boolean parallel(Line otherLine)
    {
        double m1 = this.slope();
        double m2 = otherLine.slope();

        //return m1 == m2;
        return Math.abs(m1-m2) <= .0001;

    }
    // Determines if 2 lines are the same length
    // param otherLine - the other line to compare to
    // return true if the lines are the same length, false otherwise
    public boolean sameLength(Line otherLine)
    {
        double m1 = this.distance();
        double m2 = otherLine.distance();
        return Math.abs(m1-m2) <= .0001;       
    }

    // main method for testing
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Line l1 = new Line(-1,-3, 2,1);
        System.out.println(l1);
        System.out.println("l1 distance = " + l1.distance());
        System.out.println("l1 Midpoint = " + l1.midpoint());
        System.out.println("l1 Slope = " + l1.slope());

        Line l2 = new Line(0,0,3,4);
        System.out.println(l2);
        System.out.println("l2 Slope = " + l2.slope());
        System.out.println("l2 distance = " + l2.distance());
        System.out.println("Parallel? " + l1.parallel(l2));
        System.out.println("Same length? " + l1.sameLength(l2));



    }

}

// Line with endpoints (-1.0, -3.0) and (2.0, 1.0)
// l1 distance = 5.0
// l1 Midpoint = (0.5, -1.0)
// l1 Slope = 1.3333333333333333
// Line with endpoints (0.0, 0.0) and (3.0, 4.0)
// l2 Slope = 1.3333333333333333
// l2 distance = 5.0
// Parallel? true   
// Same length? true