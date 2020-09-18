package com.cs122.classlabs.Chapter10;

public class Programming {
	
	public static void main(String[] args)
    {
        Students test1, found1;
        Students [] friends = new Students[6];

        friends[0] = new Students("U01938593", "John");
        friends[1] = new Students("U21577538", "Sarah");
        friends[2] = new Students("U73375529", "Mark");
        friends[3] = new Students("U66325539", "Laura");
        friends[4] = new Students("U46453534", "Larry");
        friends[5] = new Students("U32255284", "Frank");
        

        Searching<Contact> searches = new Searching<Contact>();

        test1 = new Students("U32255284", "");
        found1 = searches.linearSearch(friends, test1);
        if (found1 != null)
            System.out.println ("Found: " + found1);
        else
            System.out.println ("The student from programming class was not found. 1");
        System.out.println ();

        Sorting<Students> sorts = new Sorting<Students>();
        sorts.selectionSort(friends);

        test1 = new Students ("U21577538", "");
        found1 = searches.binarySearch(friends, test1); // why do we cast here? and not in last
        if (found1 != null)
            System.out.println ("Found: " + found1);
        else
            System.out.println ("The student from programming class was not found.");
        
        //use the slides of the class to complete the lab and the homework.
        //should I create the own methods of compare and sort with the returning types of student calls, or should I change the returning type of the method eveytime I have to use this class?
    }

}
