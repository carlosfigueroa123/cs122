
public class NumSum {

	 public static int sumDigits(String str) {
	        int currentSum = 0;
	        int n = str.length();
	        for(int i = 0; i < n; i++){
	            char c = str.charAt(i);
	            if(Character.isDigit(c))
	                currentSum += Integer.parseInt(c+"");
	        }
	        return currentSum;
	    }
	    public static void main(String[] args){
	        System.out.println(sumDigits("ccc123"));
	    }

}
