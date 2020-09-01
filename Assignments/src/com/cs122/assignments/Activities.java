package com.cs122.assignments;

public class Activities {
	   public static String activityName = "soccer";
			 public static int suggestedHours = 2;
			 public static String locationType = "corn field";
	     public static boolean oddHours = false;
		    

	 public static void printActivity() {
	    	System.out.println("The " + locationType + " activity " + activityName + " is suggested for " + suggestedHours + " hours");
	    	
	    }

	  public static void preferredActivity(String activityPreferred){
	    System.out.println("I prefer " + activityPreferred + " over " + activityName);

	  }
	  
	  public static boolean getOddHours(){
	if (suggestedHours >= 7){
	  return true;
	}
	else{
	  return false;
	}
	  }
	  
		
	}