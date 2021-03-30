
public class Trying {

	
//	public static void print(int n) {
//		if (n>2) {
//			System.out.println("Hello");
//			print(n/2);
//		}
//		else {
//			System.out.println("hELOOO");
//		}
//	}
//	
//	public static double median ( int[] input, int i, int j) {
//		if(j<=i) {
//			return 0;
//		}
//		else {
//			return ((median(input, i, j-1) + input[j-1]) / 2);
//		}
//	}
//	
//	public static void print1(int n){
//		if (n > 1) {
//		System.out.println("Hello");
//		print1(n - 1);
//		System.out.println("Hello");
//		}
//		else {
//		System.out.println("Hello");
//		}
//		
//		}
//	public static void print(int n) {
//		if(n/2 > 1) {
//			for(int i = 0; i < n; i++) {
//				System.out.println("Hello");
//			}
//			print(n/2);
//			print(n/2);
//		}
//			else {
//				System.out.println("hELOO");
//			}
//		}
//	
//	
//	public static void print11(int n){
//		if (n > 1) {
//		System.out.println("Hello");
//		print11(n / 10);
//		System.out.println("Hello");
//		}
//		else {
//		System.out.println("Hellooo");
//		}
//		
//		}
//	
	
	public static int arraySum(int [] array, int lowIndex, int highIndex) {
		if(highIndex==0) {
			return 0;
		}
		
		else {
			return arraySum(array, 0, highIndex-1) + array[highIndex-1];
		}
	}
	
//	static void fillPrefixSum(int arr[], int n, int prefixSum[], int target) {
//	 	prefixSum[0] = arr[0];
//
//			// Adding present element
//			// with previous element
//	 		for (int i = 1; i < n; ++i) {
//	 				prefixSum[i] = prefixSum[i - 1] + arr[i];
//	 				
//	 				if(prefixSum[i] == target) {
//	 					break;
//	 				}
//	 		}
//	 		
// 		}
	
	
	public static void main(String [] args) {

		// T(n) = T(n-1) + O(1) = O(n)
		
		int [] input = {4,1,-2};
		
		
		System.out.println(arraySum(input, 0, input.length));
		
//		int arr[] = {4, 1, 2};
//        int n = arr.length;
//        int prefixSum[] = new int[n];
//        int target = 5;
// 
//        fillPrefixSum(arr, n, prefixSum, target);
// 
//        for (int i = 0; i < n; i++)
//            System.out.print(prefixSum[i] + " ");
//        System.out.println("");
	}
}
