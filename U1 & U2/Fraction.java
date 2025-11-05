public class Fraction {
	private int numerator;		//attributes
	private int denominator;
	
	// constructor
	public Fraction(int n, int d)	// constructor
	{
		numerator = n;
		denominator = d;
	}
	
	//TODO default constructor (no arguments)
	public Fraction() {
	numerator = 1;
	denominator = 2;
	}
	
	public int getNum()
	{
		return numerator;
	}
	public int getDenom()
	{
		return denominator;
	}
	public Fraction add(Fraction other)
	{
		int n = this.numerator*other.denominator + this.denominator*other.numerator;
		int d = this.denominator * other.denominator;
		
		Fraction result = new Fraction(n,d);
		return result;
	}
	
	// TODO  subtract()
	public Fraction subtract(Fraction other){
    int a = this.numerator*other.denominator - this.denominator*other.numerator;
    int b = this.denominator * other.denominator;

    Fraction result = new Fraction(a,b);
    return result;
    }
	// TODO multiply()
    public Fraction multiply(Fraction other){
        int c = this.numerator*other.numerator;
        int d = this.denominator*other.denominator;

        Fraction result = new Fraction(c,d);
        return result; 
    }
	
	// TODO toString()
    public String toString(){
        String s = numerator + " / " + denominator;
        return s;
    }

	
	// TODO reciprocal()
    public Fraction reciprocal(){
        int e = this.numerator;
        int g = this.denominator;
        Fraction result = new Fraction(g,e);
        return result;
    }

	
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3,4);	// create an instance of fraction
		Fraction f2 = new Fraction(4,5);	
		
		Fraction f3 = f1.add(f2);			// add 2 fractions
		System.out.println("3/4 + 4/5 = " + f3);	// print the answer
			
		
		Fraction f4 = f1.subtract(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);
		
		//Add code to multiply f1 and f2 here
		Fraction f5 = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + f5);
		//Add code to call reciprocal here
		Fraction f6 = f1.reciprocal();
        System.out.println("The reciprocal of " + f1 + " =   " + f6);
		//create 2 new fractions and add them here.
        Fraction f7 = new Fraction(7,9);
        Fraction f8 = new Fraction(2,5);
        Fraction f9 = f7.add(f8);
        System.out.println(f9);
		
			
		

	}

}

/*
3/4 + 4/5 = 31 / 20
3 / 4 - 4 / 5 = -1 / 20
3 / 4 * 4 / 5 = 12 / 20
The reciprocal of 3 / 4 =   4 / 3
53 / 45
 */