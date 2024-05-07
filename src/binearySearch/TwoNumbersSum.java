package binearySearch;

public class TwoNumbersSum
{
public int[] twosum(int[]nums,int target)
{
	for(int i=0;i<nums.length;i++)
	{
		for( int j=i+1;j<nums.length;j++)
		{
			if(nums[i]+nums[j]==target)
			{
				return new int[]{i,j};
			}
		}
	}
	throw new IllegalArgumentException("No two elements sum up to the target.");
}

public static void main(String[] args) {
	TwoNumbersSum sum=new TwoNumbersSum();
	int []sums= {2,5,5,13};
	int target=10;
	int []result=sum.twosum(sums,target );
	System.out.println(result[0]+" ,"+result[1]);
}
}
