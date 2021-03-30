
public class ShipDocks {

	public static int shipDocks(double [] departure, double [] arrival) {
		
		int docks = 0; // initializing the variable supposed to be returned
		int indexDeparture = 0;
		int indexArrival = 0;
		int currentShips = 0;
		
		while (indexDeparture < departure.length || indexArrival < arrival.length) {
			
			if(arrival[indexArrival] < departure[indexDeparture]) {
				indexArrival++;
				currentShips++;
				if(docks < currentShips) {
					docks = currentShips;
				}
				
			}
			else {
				indexDeparture++;//they are going away
				currentShips--;//in this case this line is not being used
			}
			if(indexArrival == arrival.length) {//why are we breaking it manually?
				break;
			}
				
		}
		
		return docks;
		
	}
public static void main(String[] args) {
	
	double [] arrivals = {2.0,2.05,2.1};
	double [] departures = {2.14,2.15,2.20};
	
		
		System.out.println(shipDocks(departures, arrivals));
		
	}
	
	
}
