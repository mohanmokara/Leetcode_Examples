package binearySearch;

public class FindSingleDigit 
{
	public int  singleNumber(int[] nums)
    {
		int result=0;
		for (int num : nums) {
            result ^= num;
        }

        return result;
	
    }
	
public static void main(String[] args) {
	FindSingleDigit ref=new FindSingleDigit();
	int[]nums= {2,4,1,2,1,2};
	int res=ref.singleNumber(nums);
	System.out.println(res);
}
}
