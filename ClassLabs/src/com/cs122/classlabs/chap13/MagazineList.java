package com.cs122.classlabs.chap13;


//*******************************************************************
//  MagazineList.java       Author: Lewis/Loftus
//
//  Represents a collection of magazines.
//*******************************************************************

public class MagazineList
{
    private MagazineNode list;

    //----------------------------------------------------------------
    //  Sets up an initially empty list of magazines.
    //----------------------------------------------------------------
    public MagazineList()
    {
        list = null;
    }

    //----------------------------------------------------------------
    //  Creates a new MagazineNode object and adds it to the end of
    //  the linked list.
    //----------------------------------------------------------------
    public void add(Magazine mag)
    {
        MagazineNode node = new MagazineNode(mag);
        MagazineNode current;//pointer for the beginning to search for the end of the list

        if (list == null)
            list = node;
        else
        {
            current = list;
            while (current.next != null)
                current = current.next;//going forward
            current.next = node;//assigning, this is where we add node, the new magazine introduced
        }
    }

    //----------------------------------------------------------------
    //  Returns this list of magazines as a string.
    //----------------------------------------------------------------
    public String toString()
    {
        String result = "";

        MagazineNode current = list;

        while (current != null)
        {
            result += current.magazine + "\n";
            current = current.next;
        }

        return result;
    }

    //*****************************************************************
    //  An inner class that represents a node in the magazine list.
    //  The public variables are accessed by the MagazineList class.
    //*****************************************************************
    public class MagazineNode
    {
        public Magazine magazine;//object it has
        public MagazineNode next;//reference, pointing to the next magazine node, whcih we use on top
        //next comes from the node class

        //--------------------------------------------------------------
        //  Sets up the node
        //--------------------------------------------------------------
        public MagazineNode(Magazine mag)
        {
            magazine = mag;
            next = null;
        }
    }
}
