package com.cs122.classlabs.Chapter10;

import java.awt.List;
import java.sql.Array;

//********************************************************************
//  Searching.java       Author: Lewis/Loftus
//
//  Demonstrates the linear search and binary search algorithms.
//********************************************************************

public class Searching<T>
{
    //-----------------------------------------------------------------
    //  Searches the specified array of objects for the target using
    //  a linear search. Returns a reference to the target object from
    //  the array if found, and null otherwise.
    //-----------------------------------------------------------------
    public Students linearSearch ( Students [] friends , Students test1)
    {
        int index = 0;
        boolean found2 = false;

        while (!found2 && index < ((friends).length))
        {
            if (friends[index].equals(test1))
                found2 = true;
            else
                index++;// this means it sums up
        }

        if (found2)
            return friends[index];
        else
            return null;
    }

    //-----------------------------------------------------------------
    //  Searches the specified array of objects for the target using
    //  a binary search. Assumes the array is already sorted in
    //  ascending order when it is passed in. Returns a reference to
    //  the target object from the array if found, and null otherwise.
    //-----------------------------------------------------------------
    public Students binarySearch(Students[] friends,
            Students test1)
    {
        int min = 0, max = friends.length - 1, mid = 0;
        boolean found = false;

        while (!found && min <= max)
        {
            mid = (min+max) / 2;
            if (friends[mid].equals(test1))
                found = true;
            else
                if (test1.compareTo((Students)friends[mid]) < 0)//because we have to compare if x>n/2 and if it is possible it means that goes up, negative goes left and 0 is the same, so to not do else if, and because we are not trying to find they are equal, we just want to see it we go right
                    max = mid-1;
                else
                    min = mid+1;
        }

        if (found)
            return friends[mid];
        else
            return null;
    }

	public Contact linearSearch(Contact[] friends, Contact test) {
		
		 int index = 0;
	        boolean found = false;

	        while (!found && index < ((friends).length))
	        {
	            if (friends[index].equals(test))
	                found = true;
	            else
	                index++;// this means it sums up
	        }

	        if (found)
	            return friends[index];
	        else
		
		return null;
	}

	public Contact binarySearch(Contact[] friends, Contact test) {
		 int min = 0, max = friends.length - 1, mid = 0;
	        boolean found = false;

	        while (!found && min <= max)
	        {
	            mid = (min+max) / 2;
	            if (friends[mid].equals(test))
	                found = true;
	            else
	                if (test.compareTo((Contact)friends[mid]) < 0)//because we have to compare if x>n/2 and if it is possible it means that goes up, negative goes left and 0 is the same, so to not do else if, and because we are not trying to find they are equal, we just want to see it we go right
	                    max = mid-1;
	                else
	                    min = mid+1;
	        }

	        if (found)
	            return friends[mid];
	        else
		return null;
	}
}
