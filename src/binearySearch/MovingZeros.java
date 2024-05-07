package binearySearch;

import java.util.Arrays;

public class MovingZeros 
{
public void zerosmove(int[]nums)
{
	int nonzeroindex=0;
	 for(int i=0;i<nums.length;i++)
	 {
		 if(nums[i]!=0)
		 {
			 nums[nonzeroindex]=nums[i];
			 nonzeroindex++;
		 }
		 
	 }
	 for(int j=nonzeroindex;j<nums.length;j++)
	 {
		 nums[j]=0;
	 }
	System.out.println(Arrays.toString(nums));
}
public static void main(String[] args) {
	MovingZeros ref=new MovingZeros();
	int []nums= {0,1,0,3,12};
	ref.zerosmove(nums);
}
}
