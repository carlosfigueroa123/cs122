package com.cs122.assignments;

import java.util.Scanner;

public class SearchingRecursive{
	
public int binarySearch(int target , int[] arr, int lowIndex, int highIndex)
{


        int mid = lowIndex + (highIndex - lowIndex) / 2;
        if(highIndex < lowIndex){
			 return -1;
		} 
		
		
		if (target < arr[mid]){
			return binarySearch(target, arr, lowIndex, mid - 1);
		}
		
		if (target > arr[mid]){
			return binarySearch(target, arr, mid + 1, highIndex);
		}
		
		if (target == arr[mid]){
			return mid;
		}
		
		return -1;
}

	
public static void main(String args[])
{
	SearchingRecursive ob = new SearchingRecursive();
int arr[] = { 2, 3, 4, 10, 15, 30, 50};
int highIndex = arr.length;
int lowIndex = 0;
int target;
Scanner scan = new Scanner(System.in);

System.out.println("Please enter the number you are looking for: ");
target = scan.nextInt();

int result = ob.binarySearch(target, arr, lowIndex, highIndex - 1);


if (result == -1) {
System.out.println("Element not present");
}
else {
System.out.println("Element found at index: " + result);
}

}
}

