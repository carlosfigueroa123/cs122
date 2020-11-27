package com.cs122.assignments;

import java.util.Scanner;

public class SearchingRecursive <T>{
	
public int binarySearch(int arr[] , int lowIndex, int highIndex, int target)
{
	
if (highIndex >= lowIndex && lowIndex < arr.length-1) { 

int mid = lowIndex + (highIndex - lowIndex) / 2;

if (arr[mid] == target)
  return mid;

if (arr[mid] > target) {
  return binarySearch(arr, lowIndex, mid - 1, target);
}

else {
return binarySearch(arr, mid + 1, highIndex, target);
}

}

// We reach here when element is not present in array
return -1;
}

	
public static void main(String args[])
{
	SearchingRecursive ob = new SearchingRecursive();
int arr[] = { 2, 3, 4, 10, 40 };
int highIndex = arr.length;
int lowIndex = 0;
int target;
Scanner scan = new Scanner(System.in);

System.out.println("Please enter the number you are looking for: ");
target = scan.nextInt();

int result = ob.binarySearch(arr, lowIndex, highIndex - 1, target);

if (result == -1)
System.out.println("Element not present");
else
System.out.println("Element found at index: " + result);

}
}

