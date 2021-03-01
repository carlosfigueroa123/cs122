
class WebPage{
   String url;
   String content;
   WebPage(String url, String content) {
       this.url = url;
       this.content = content;
   }
   public void display() {
       System.out.println("URL: " + url);
       System.out.println("Content: <html>" + content + "</html>\n");
   }
}

class HistoryState {//this is like the node class
   WebPage page;
   HistoryState prev;
   HistoryState next;
   public void setPrev(HistoryState p) { 
		 prev = p; 
		 }
	 public void setNext(HistoryState n) { 
		 next = n; 
		 }
	 
   HistoryState(WebPage p) {
	   page = p;
	   }
}
class BrowserHistory {
	   HistoryState current;
	   WebPage errorPage;
	   HistoryState header;
	   
	   
	   BrowserHistory() {
	       current = null;
	       errorPage = new WebPage(null, "404 not found");
	   }
	   
	   public void navigate (String x, String y) {
		   add(x,y);
		}
			 
	   public void add(String a, String b) {
		   WebPage newNode = new WebPage (a,b);
		   HistoryState n = new HistoryState(newNode);
		   HistoryState current1 = new HistoryState(newNode);
		  
		      if (header == null)
		          header = n;
		      
		      else
		      {
		          current1 = header;
		          while (current1.next != null)
		              current1 = current1.next;//going forward
		          current1.next = n;//assigning, this is where we add node
		          n.prev = current;//current1 as a stack 
		      }
		      current = n;
		      n.page.display();
		     
	   }
	   
	   public void back() {
		 
		   if (current == null) {
			   System.out.println("No valid current page!");
			   errorPage.display();
		   }
		   else if (current.prev == null) {
			   System.out.println("No valid page to go back to! Staying on page:");
			   current.page.display();
		   }
		   else  {
				 current = current.prev;
				 current.page.display();
				 
		
		   }
		   }

	   public void forward() {
		   if (current == null || current.next == null) {
			   System.out.println("No valid page to go forward! Staying on page:");
			   current.page.display();
		   }
		   else {
				 current = current.next;
		 current.page.display();
		   }
		   
	   }
	}







