import java.util.*;

public class Recitationnn {
	
	public static class recitation1 {
		
		   public static void main(String[] args) throws CloneNotSupportedException 
		   {
		       Factory factory = new Factory ("California", "Gigafactory");
		       Tesla car1 = factory.produceCar();

		       List <Tesla> fleet = factory.massProduceCars(car1, 5);
		       for(int i = 0; i < fleet.size(); i++) {
		           Tesla car = fleet.get(i);
		           car.factory.printFactory();
		           System.out.println("Battery address: " + car.battery);
		           System.out.println();
		       }
		   }
		}
	class Factory{
		   String location;
		   String name;
		   
		   Factory(String loc, String n) {
		       location = loc;
		       name = n;
		   }
		   public void printFactory() {
		       System.out.println("Factory:");
		       System.out.println(" - Name: " + this.name);
		       System.out.println(" - Location: " + this.location);
		       System.out.println(" - Memory Address: " + this);
		   }
		   public Tesla produceCar() {
		       // implement this
		   }
		   public List<Tesla> massProduceCars(Tesla t, int n) throws
		           CloneNotSupportedException {
		       // implement this (hint: use a list or array list)
		   }
		}
	class Tesla implements Cloneable
	{
	   int price;
	   int top_speed;
	   Battery battery;
	   Factory factory;
	   Tesla(Factory f)
	   {
	       factory = f;
	       price = 35000;
	       top_speed = 160;
	       battery = new Battery();
	   }
	   public Object clone() throws CloneNotSupportedException
	   {
	       // implement this
	   }
	}
	class Battery implements Cloneable
	{
	    int volts;
	    Battery()
	    {
	        volts = 375;
	    }
	    public Object clone() throws
	                   CloneNotSupportedException
	    {
	        return super.clone();
	    }
	}



}
