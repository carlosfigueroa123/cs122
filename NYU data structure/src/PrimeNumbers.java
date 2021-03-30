
public class PrimeNumbers {

	public static void pri(int n) {
		if (n<2) {
			return;
		}
		boolean priis = true;
		
		for (int i = 2; i<=n; i++) {
			priis = true;
			for(int j = 2; j<i; j++) {
				if(i%j== 0) {//if i is divided by 2? includes 9 which can be divided by 3, so its not about cousin numbers
					priis = false;
				}
			}
			if(priis == true) {
				System.out.println(i);
			}
			
		}
	}
	public static void pri1(int n) {
		if (n<2) {
			return;
		}
		boolean priis = true;
		
		for (int i = 2; i < n; i++) { //i has to be less than n, never equal to.
			if (n % i == 0) {
				priis = false;
			}
			}
		
		pri1(n-1);
		if (priis == true) {
			System.out.println(n);//iteratively going through each number that tests to be true
		}
		
		}
	
	public static void main(String[] args) {
		
		pri1(10);
		
	}
}
