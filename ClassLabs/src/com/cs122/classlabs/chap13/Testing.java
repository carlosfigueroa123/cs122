package com.cs122.classlabs.chap13;

import java.util.Scanner;

public class Testing {

    int binarySearch(int x, int[] arr, int l, int r)
    {
            int mid = l + (r - l) / 2;
            if(r < l){
   			 return -1;
   		} 
   		
   		
   		if (x < arr[mid]){
   			return binarySearch(x, arr, l, mid - 1);
   		}
   		
   		if (x > arr[mid]){
   			return binarySearch(x, arr, mid + 1, r);
   		}
   		
   		if (x == arr[mid]){
   			return mid;
   		}
   		
   		return -1;
    }
 
  
    public static void main(String args[])
    {
    	Scanner scan = new Scanner(System.in);
        Testing ob = new Testing();
        int arr[] = { 2, 3, 4, 10, 30, 50};
        int n = arr.length;
        int x;
        System.out.println("Please enter the number you are looking for: ");
        x = scan.nextInt();
        int result = ob.binarySearch(x, arr, 0, n - 1);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

}
