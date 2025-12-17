package U5;

public class Bus{
    private int numStops;
    private int curStop;
    private int direction;
    private int busNumber;
    private static int numBusses = 0;

    public Bus(int x){
        numStops = x;
        curStop = 1;
        direction = 1;
        numBusses++;
        busNumber = numBusses;
    }
    public Bus(){
        this(8);
    }

    public void move(){
        curStop += direction;
        if (curStop == numStops) direction = -1;
        if (curStop == 0) direction = 1;
    }

    public void move(int x){
        for (int i = 1; i <= x; i++) move();

    }
    public String toString(){
        return "Bus Number " + busNumber + " at stop " + curStop;
    }

    public static int getNumberOfBusses(){
        return numBusses;
    }
    
    public boolean atSameStop(Bus other){
        return this.curStop == other.curStop;
    }

    public static void main(String[] args) {
        Bus b1 = new Bus(7);
        Bus b2 = new Bus();
        System.out.println(b1);
        System.out.println(b2);
        b1.move(4);
        System.out.println(b1);
        Bus b3 = new Bus();
        System.out.println(getNumberOfBusses());
        b3.move(4);
        System.out.println(b1.atSameStop(b3));
        System.out.println(b1.atSameStop(b2));

    
    }
}