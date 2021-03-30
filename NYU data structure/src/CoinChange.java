public class CoinChange {
	
public static int coinChange(int[] denominations, int change) {
	
if(change == 0) {
 return 0;
}
else {
int min = Integer.MAX_VALUE;

for (int i=0; i<denominations.length; i++) {
	
  if (denominations[i] <= change) {
      int temp = coinChange(denominations, change - denominations[i]);

      if (temp != 0 && temp + 1 < min)
         min = temp + 1;
  }
}

return min;


}
}


public static void main(String[] args) {
	int [] array = {25, 10, 5};
	int k = 11;
	
	System.out.println(coinChange(array, k));
}


}



