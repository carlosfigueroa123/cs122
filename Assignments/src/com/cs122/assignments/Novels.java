package com.cs122.assignments;

public class Novels {
	
	protected int numPages = 350;
	protected int numChapters = 3;
	protected int numCharacters = 5679;
	protected String nameOfNovel = "The resistence";
	protected String topicOfNovel = "how inmerse we sometimes are in life.";


	protected int numPages2 = 450;
	protected int numChapters2 = 6;
	protected int numCharacters2 = 1596;
	protected String nameOfNovel2 = "Okarina the legend of time";
	protected String topicOfNovel2 = "how heroism can trascend time.";


	public void characteristicsOfNovels(String whichNovel)
	{
		if (whichNovel.equalsIgnoreCase("novel1")) {
	    System.out.println(" The name of the first novel is " + nameOfNovel + ". This novel has " + numPages + " pages, " + numChapters + " chapters and " + numCharacters + " charaters");
	    System.out.println(" This novel talks about " + topicOfNovel + "\n");
		}
		else if (whichNovel.equalsIgnoreCase("novel2")) {
			System.out.println(" The name of the second novel is " + nameOfNovel2 + ". This novel has " + numPages2 + " pages, " + numChapters2 + " chapters and " + numCharacters2 + " charaters");
		    System.out.println(" This novel talks about " + topicOfNovel2 + "\n");
		}
	}

	

}
