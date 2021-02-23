
public class MaxSpan {
	public static int maxSpan(int[] nums) {
        int n = nums.length;
        if(n == 0)
            return 0;
        int mSpan = 1;
        for(int i = 0; i < n-1; i++){
            int left_point = i;
            int right_point = i;
            for(int j = i+1; j < n; j++){//why not n-1 here?
                if(nums[j] == nums[i])
                    right_point = j;
            }
            mSpan = Integer.max(mSpan, right_point - left_point + 1);//mSpan is a recursive variable
        }
        return mSpan;
    }
	    
    public static void main(String[] args){
	int xx = 100000;
        int[] nums = new int[2 * xx];
        for(int i = 0; i < xx; i++)
            nums[i] = i;
        for(int i = xx; i < 2*xx; i++)
            nums[i] = 2*xx - i - 1;
        
        System.out.println(maxSpan(nums));
    }

}

