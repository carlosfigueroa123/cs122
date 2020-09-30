package com.cs122.classlabs.Chapter10;

//create a class called Students with properties `uid(integer) and name(String)
//needs to have a comparable implementation

public class Students implements Comparable<Students> {
	
	protected String uid;
	protected String name;
	
	public Students(String first, String second)//this is a constructor
    {
        uid= first;
        name= second;
       
    }
	public String toString() // it will print an address if not here
    {
		return name + ", " + uid;
    }
	
	public boolean equals(Object other)//object? what is that?
    {
        return (uid.equals(((Students)other).getID()));
                
    }
	
	public int compareTo(Students other)
    {
        int result = 0;

        if (uid.equals(other.getID()))
            result = uid.compareTo(other.getID());
        
    	else 
        result = name.compareTo(other.getID()); //why not to getName?
        
        return result;
    }

	 public String getName()
	    {
	        return name;
	    }
	 public String getID()
	    {
	        return uid;
	    }
	

	
	
	

}
