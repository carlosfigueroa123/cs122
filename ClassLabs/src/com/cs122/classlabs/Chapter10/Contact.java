package com.cs122.classlabs.Chapter10;

//********************************************************************
//  Contact.java       Author: Lewis/Loftus
//
//  Represents a phone contact.
//********************************************************************

public class Contact implements Comparable<Contact>//are we instantiating t here?, also,does comparable works as a type of interfase?
{
    private String firstName, lastName, phone;//why not protected?
//comparable is an interfase from java
    //-----------------------------------------------------------------
    //  Constructor: Sets up this contact with the specified data.
    //-----------------------------------------------------------------
    public Contact(String first, String last, String telephone)//this is a constructor
    {
        firstName = first;
        lastName = last;
        phone = telephone;
    }

    //-----------------------------------------------------------------
    //  Returns a description of this contact as a string.
    //-----------------------------------------------------------------
    public String toString() // where are we using this method?
    {
        return lastName + ", " + firstName + "\t" + phone;
    }

    //-----------------------------------------------------------------
    //  Returns a description of this contact as a string.
    //-----------------------------------------------------------------
    public boolean equals(Object other)//object? what is that?
    {
        return (lastName.equals(((Contact)other).getLastName()) &&
                firstName.equals(((Contact)other).getFirstName()));//what?
    }

    //-----------------------------------------------------------------
    //  Uses both last and first names to determine ordering.
    //-----------------------------------------------------------------
    public int compareTo(Contact other)//are contact and object both subjective objects?
    {
        int result;

        if (lastName.equals(other.getLastName()))
            result = firstName.compareTo(other.getFirstName());
        else
            result = lastName.compareTo(other.getLastName());

        return result;
    }

    //-----------------------------------------------------------------
    //  First name accessor.
    //-----------------------------------------------------------------
    public String getFirstName()
    {
        return firstName;
    }

    //-----------------------------------------------------------------
    //  Last name accessor.
    //-----------------------------------------------------------------
    public String getLastName()
    {
        return lastName;
    }
}
