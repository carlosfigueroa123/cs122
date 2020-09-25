package com.cs122.assignments;


public class Numbers implements Comparable<Numbers>{
	 public int numbers;
	 
	    public Numbers(int num)//this is a constructor
	    {
	        numbers = num;
	    }
	    
	    public String toString() 
	    {
	        return numbers + " ";
	    }


	    public int compareTo(Numbers toCompare)//If we put 1 in < and -1 in the else, it would be ascending order
	    {
	        
	        if (toCompare.numbers == this.numbers)
	        return 0;

	        if (toCompare.numbers < this.numbers)
	        return -1;
	        
	        else
	        	return 1;
	       
	    }

	
	    public int getNum()
	    {
	        return numbers;
	    }
	    
}
