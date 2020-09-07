package com.cs122.assignments;

public class Books {
	
protected int numPages = 1240;
protected int numChapters = 24;
protected int numCharacters = 12034;
protected String nameOfBook = "The wizard of oz";
protected String topicOfBook = "the relativity of time.";

protected int numPages2 = 1520;
protected int numChapters2 = 32;
protected int numCharacters2 = 17034;
protected String nameOfBook2 = "The lion and the dragon";
protected String topicOfBook2 = "the quest of the king to kill a dragon.";

public void characteristicsOfBooks(String whichBook)
{
	if (whichBook.equalsIgnoreCase("book1")) {
    System.out.println(" The name of the first book is " + nameOfBook + ". This book has " + numPages + " pages, " + numChapters + " chapters and " + numCharacters + " charaters");
    System.out.println(" The topic of the book is " + topicOfBook + "\n");
	}
	else if (whichBook.equalsIgnoreCase("book2")) {
	System.out.println(" The name of the second book is " + nameOfBook2 + ". This book has " + numPages2 + " pages, " + numChapters2 + " chapters and " + numCharacters2 + " charaters");
	System.out.println(" The topic of the book is " + topicOfBook2 + "\n");
	}
}


}
