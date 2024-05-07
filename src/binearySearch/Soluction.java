package binearySearch;

public class Soluction 
{
public int search(int []nums,int target)
{
	for(int i=0;i<nums.length;i++)
	{
		if(nums[i]==target)
		{
			return i;
		}
	}
	return -1;
}
public static void main(String[] args) {
	Soluction sol=new Soluction();
	 System.out.println(sol.search(new int[] {-1,0,3,5,9,12}, 3));
	
}
}
