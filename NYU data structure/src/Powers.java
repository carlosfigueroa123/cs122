
public class Powers {

    public static void main(String[] args) {
        int base = 3;
        int powerRaised = 4;
        int result = power1(base, powerRaised);

        System.out.printf("%d^%d = %d", base, powerRaised, result);
    }

    public static int power(int base, int powerRaised) {//inneficient case
        if (powerRaised != 0)
            return (base * power(base, powerRaised - 1));
        else
            return 1;
    }
    
    public static int power1(int base, int powerRaised)//most efficient form
    {
    	if(powerRaised == 0) {
    		return 1;
    	}
    	
    	int square = power1(base, powerRaised/2);
    	
    	if(powerRaised %2 == 0) {
    		return square*square;
    	}
    	else 
    		return square*square * base;
    }
    }