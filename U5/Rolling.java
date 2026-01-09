package U5;

public class Rolling {
    /** @return an integer value between 1 and 6
	*/
	public static int toss()
	{
		return (int)(6 * Math.random()) + 1;
	}
	
	/* Write the method getRolls that takes a number of tosses as a parameter.  The method
	should return an array of values produced by rolling the die the given number of times.
	*/
	
	/** Returns an array of the values obtained by tossing the die numTosses times.
	 *  @param numTosses the number of die tosses
	 *			Precondition: numTosses >0
	 *	@return an array of numTosses values
	 */
	public static int[] getRolls(int numTosses)
	{
        int[] rolls = new int[numTosses];
		for(int x = 0; x < numTosses; x++){
            rolls[x] = toss();
        }
		return rolls;
	}
	
	/*Write the method getBestRun that takes as its parameter a array of integer values 
	representing a series of die tosses.  The method returns the starting index in the array 
	of a run of maximum size.  A run is defined as the repeated occurrence of the same value 
	in 2 or more consecutive positions in the array.  If there are 2 runs of the same size
	it may return either index.  If there are no runs, the method returns -1.
	Precondition:  values.length > 0
	*/
	
	public int getBestRun(int[] values)
	{
        
        int c = 0;
        int d = -1;
        for(int x = 1; x < values.length; x++){
            int b = 0;
            for(int y = x; y < values.length && values[y] == values[y-1]; y++){
            if(values[x] == values[x-1]){
                b++;
                if(b >= c){
                    c = b;
                    d = y - c;
                }
            }
            }
        }
		return d;  
	}
	

	public static void main(String[] args) {
		Rolling nc = new Rolling();
		
			int[] tossArr = nc.getRolls(20);
			for (int i = 0; i < tossArr.length; i++)
                if(i != tossArr.length - 1){
                    System.out.print(tossArr[i] + ", ");
                }
				else{
                    System.out.print(tossArr[i]);
                }
			System.out.println();
			
			
			int x = nc.getBestRun(tossArr);
			System.out.println(x);
	}

}
