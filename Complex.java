public class Complex {
    private double real; // attributes
    private double imaginary;

    public Complex(double a, double b){
        real = a;
        imaginary = b;
    }

    public Complex(double c){
        real = c;
        imaginary = 0.0;
    }

    public String toString(){
        String s = real + " + " + imaginary + "i";
        return s;
    }

    public Complex add(Complex other){
		double r = this.real + other.real;
		double i = this.imaginary + other.imaginary;
		
		Complex result = new Complex(r,i);
		return result;
	}

    public Complex add(double p){
        double r = this.real + p;
        double i = this.imaginary;

        Complex result = new Complex(r,i);
        return result;
    }

    public Complex multiply(Complex other){
        double r = (this.real*other.real) + (this.imaginary*other.imaginary*-1);
        double i = (this.imaginary*other.real) + (this.real*other.imaginary);

        Complex result = new Complex(r,i);
        return result;
    }   
    
    public Complex multiply(double p){
        double r = this.real * p;
        double i = this.imaginary * p;

        Complex result = new Complex(r,i);
        return result;
    }
    public static void main(String[] args) {
        Complex c1 = new Complex(3,4);
        Complex c2 = new Complex(5,6);
        Complex c3 = new Complex(-9,2);
        Complex c4 = new Complex(-8,-11);
        Complex c5 = new Complex(0,4);
        Complex c6 = new Complex(5,0);
        
        



        Complex c7 = c1.add(c3);
        System.out.println(c7);
        Complex c8 = c2.multiply(c4);
        System.out.println(c8);
        Complex c9 = c5.multiply(5);
        System.out.println(c9);
        Complex c10 = c6.add(24);
        System.out.println(c10);

			
    }

    
}
