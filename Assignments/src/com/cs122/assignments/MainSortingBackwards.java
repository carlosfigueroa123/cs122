package com.cs122.assignments;


public class MainSortingBackwards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Numbers [] friends = new Numbers[6];

        friends[0] = new Numbers(2);
        friends[1] = new Numbers(5);
        friends[2] = new Numbers(3);
        friends[3] = new Numbers(8);
        friends[4] = new Numbers(1);
        friends[5] = new Numbers(6);
        
        //Here, both algoritms return values in decending order
        //and that depends on the compareTo method instantiated in the Numbers class
		
		Sorting<Numbers> sorts = new Sorting<Numbers>();
        sorts.selectionSort(friends);
        
        for (Numbers num: friends)
        	System.out.println(num);
        
        System.out.println("====================================");
        Sorting<Numbers> sorts1 = new Sorting<Numbers>();
        sorts1.insertionSort(friends);
        
        for (Numbers num1: friends)
        	System.out.println(num1);
	}

}
