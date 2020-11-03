package com.cs122.classlabs.chap12;


//********************************************************************
//  TowersOfHanoi.java       Author: Lewis/Loftus
//
//  Represents the classic Towers of Hanoi puzzle.
//********************************************************************

public class TowersOfHanoi
{
    private int totalDisks;

    //-----------------------------------------------------------------
    //  Sets up the puzzle with the specified number of disks.
    //-----------------------------------------------------------------
    public TowersOfHanoi(int disks)
    {
        totalDisks = disks;
    }

    //-----------------------------------------------------------------
    //  Performs the initial call to moveTower to solve the puzzle.
    //  Moves the disks from tower 1 to tower 3 using tower 2.
    //-----------------------------------------------------------------
    public void solve()
    {
        moveTower(totalDisks, 1, 3, 2);
    }

    //-----------------------------------------------------------------
    //  Moves the specified number of disks from one tower to another
    //  by moving a subtower of n-1 disks out of the way, moving one
    //  disk, then moving the subtower back. Base case of 1 disk.
    //-----------------------------------------------------------------
    private void moveTower(int numDisks, int start, int end, int temp)//start is tower (1), temp tower (2) and end 3 (in constructor)
    {
        if (numDisks == 1)
            moveOneDisk(start, end);
        else
        {
            moveTower(numDisks-1, start, temp, end);//move n-1 starting from tower 1, setting temp as the goal (end), by using end (tower 3) as a temp (like tower 2)
            moveOneDisk(start, end);
            moveTower(numDisks-1, temp, end, start);//starting from temp (tower2), to get to end (tower3), using start (tower 1) as a temp (like tower 2)
        }
    }

    //-----------------------------------------------------------------
    //  Prints instructions to move one disk from the specified start
    //  tower to the specified end tower.
    //-----------------------------------------------------------------
    private void moveOneDisk(int start, int end)
    {
        System.out.println("Move one disk from " + start + " to " +
                end);
    }
}
