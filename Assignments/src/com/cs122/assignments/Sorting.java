package com.cs122.assignments;

//********************************************************************
//  Sorting.java       Author: Lewis/Loftus
//
//  Demonstrates the selection sort and insertion sort algorithms.
//********************************************************************

public class Sorting<T>
{
    //-----------------------------------------------------------------
    //  Sorts the specified array of objects using the selection
    //  sort algorithm.
    //-----------------------------------------------------------------
    public void selectionSort(Comparable<T>[] list)//what does T means. it is every element? do we need to instantiate it is contacts? where do we do this?
    {
        int max;
        Comparable<T> temp;

        for (int index = 0; index < list.length-1; index++)
        {
            max = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo((T)list[max]) < 0)
                    max = scan;

            // Swap the values
            temp = list[max];
            list[max] = list[index];
            list[index] = temp;
        }
    }

    //-----------------------------------------------------------------
    //  Sorts the specified array of objects using the insertion
    //  sort algorithm.
    //-----------------------------------------------------------------
    public void insertionSort (Comparable<T>[] list)
    {
        for (int index = 1; index < list.length; index++)
        {
            Comparable<T> key = list[index]; // we are using key to take specific values of the list and using it to compare it
            int position = index;

            //  Shift larger values to the right
            while (position > 0 && key.compareTo((T)list[position-1]) < 0)//position-1 is comparing with the number in the iteration behind
            {
                list[position] = list[position-1];
                position--;
            }

            list[position] = key;
        }
    }
}

		
		

