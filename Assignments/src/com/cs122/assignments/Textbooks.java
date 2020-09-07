package com.cs122.assignments;

public class Textbooks {
	
	protected int numPages = 120;
	protected int numChapters = 17;
	protected int numCharacters = 4030;
	protected String nameOfTextbook = "Chemestry for life";
	protected String topicOfTextbook = "how chemestry can be involve in multiple life-situations.";


	protected int numPages2 = 470;
	protected int numChapters2 = 24;
	protected int numCharacters2 = 17800;
	protected String nameOfTextbook2 = "Mathematics for Stochastic processes";
	protected String topicOfTextbook2 = "how ramdomness can be computed and applied in data mining.";


	public void characteristicsOfTextbooks(String whichTextbook)
	{
		if (whichTextbook.equalsIgnoreCase("textbook1")) {
	    System.out.println(" The name of the first Textbook is " + nameOfTextbook + ". This textbook has " + numPages + " pages, " + numChapters + " chapters and " + numCharacters + " charaters");
	    System.out.println(" This textbook talks about " + topicOfTextbook + "\n");
		}
		else if (whichTextbook.equalsIgnoreCase("textbook2")) {
			System.out.println(" The name of the second Textbook is " + nameOfTextbook2 + ". This textbook has " + numPages2 + " pages, " + numChapters2 + " chapters and " + numCharacters2 + " charaters");
		    System.out.println(" This textbook talks about " + topicOfTextbook2 + "\n");
		}
	}

}
