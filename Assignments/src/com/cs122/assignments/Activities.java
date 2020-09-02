package com.cs122.assignments;

public class Activities {
	   public static String activityName = "soccer";
			 public static int suggestedHours = 2;
			 public static String locationType = "corn field";
	     public static boolean oddHours = false;
		    
public Activities(){
	suggestedHours = 2;
	locationType = "corn field";
	activityName = "soccer";
}
	 public void printActivity() {
	    	System.out.println("The " + locationType + " activity " + activityName + " is suggested for " + suggestedHours + " hours");
	    	
	    }

	  public void preferredActivity(String activityPreferred){
	    System.out.println("I prefer " + activityPreferred + " over " + activityName);

	  }
	  
	  public boolean getOddHours(){
	if (suggestedHours%2 == 0){
	  return false;
	}
	else{
	  return true;
	}
	  }
	  
		
	}

