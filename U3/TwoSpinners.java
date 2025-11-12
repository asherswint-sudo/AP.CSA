package U3;

public class TwoSpinners {
 	/** Precondition: min < max
  	*/
 	/*The spin method simulates a spin of a fair spinner.
  	* The method returns a random integer between min and max,
  	* inclusive. Complete the spin method below by assigning
  	* this random integer to result.
  	*/
 	public static double spin(int min, int max)
 	{
     	
     	double a = (int)(Math.random() * (max - min + 1) + min);
        int result = (int)a;
    	return result;
 	}

 	/** Simulates one round of the game as described in part (b).
  	*/
 	public void playRound()
 	{
   	    double human1 = spin(2,8);
        double com1 = spin(1,10);	
        if (human1 > com1)  System.out.println("You win! " + (int)(human1 - com1) + " points");
        if (human1 < com1)  System.out.println("You lose. -" + (int)(com1 - human1) + " points");
        if (human1 == com1){
        double human2 = spin(2,8);
        double com2 = spin(1,10);	
        if (human2 > com2)  System.out.println("You win! 1 point");
        if (human2 < com2)  System.out.println("You lose. -1 points");
        if (human2 == com2) System.out.println("Tie. 0 points");
        }

        	
	}

 	public static void main(String[] args) {
     	TwoSpinners ds = new TwoSpinners();
     	    for(int i = 0; i < 10; i++){    //This will save you time by running playRound 10 times
         	    ds.playRound();
     	    }
 	}
}

// Output for a test round
// You win! 2 points
// You lose. -4 points
// You lose. -1 points
// You win! 4 points
// You win! 1 point
// You lose. -6 points
// You lose. -3 points
// You win! 1 points
// You lose. -1 points
// You lose. -1 points
