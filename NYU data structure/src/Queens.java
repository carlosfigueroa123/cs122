
public class Queens {

	public static boolean isConsistent(int[] q, int n) {
		
		for(int i = 0; i< n; i++) {
			if(q[i] == q[n]) {
				return false;
			}
			if(i + q[i] == n + q[n]) {
				return false;
			}
			if (q[i] - i == q[n] - n) {
				return false;
			}
		}
		return true;
	}
	
	public static int enumerate(int n) {
		int [] a = new int[n];
		return enumerate (a,0);
	}
	
	public static int enumerate(int [] q, int k) {
		int n = q.length;// so n will be equal to the n we enter on enumerate(int n) (from the main method)
		if (k == n) return 1;//base case, meaning that the array a is empty(?)
		else {
			int answer = 0;
			for(int i = 0; i < n; i++) {
				q[k] = i;
				if (isConsistent(q,k)) {
					answer += enumerate(q, k+1);//what the fuck
				}
			}
			return answer;
		}
		
		
	}
	public static void main(String [] args) {
		//int n = Integer.parseInt(args[0]);
		int n = 8;
		int answer = enumerate(n);
		System.out.println("The total number of configurations is: " + answer);
		
	}
}
