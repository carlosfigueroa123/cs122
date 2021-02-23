
public class CountTriple {
	
	public static int CountTriple(String str) {
	int n = str.length();
        int numTriples = 0;
        for(int i = 0; i < n-2; i++){//why -2??
            if( str.charAt(i) == str.charAt(i+1) && str.charAt(i+1) == str.charAt(i+2))
                numTriples += 1;
        }
        return numTriples;
    }
    public static void main(String[] args){
        System.out.println(CountTriple("xxxabyyyddd"));
    }

}
