public class recitation3 {
	   public static void main(String[] args) {
		   
	       BrowserHistory history = new BrowserHistory();

	       history.back();
	       history.navigate("www.nyu.edu", "We love purple");
	       history.navigate("www.google.com", "search for stuff");
	       history.navigate("www.yahoo.com", "did you get lost looking for google?");
	       history.navigate("www.amazon.com", "buy stuff");
	       history.forward();
	       history.back();
	       history.back();
	       history.navigate("www.facebook.com", "search for friends");
	       history.forward();
	       history.back();
	       history.back();
	       history.back();
	       history.forward();
	       history.forward();
	   }
	}
