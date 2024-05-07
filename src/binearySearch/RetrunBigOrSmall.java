package binearySearch;

import java.util.ArrayList;
import java.util.List;

public class RetrunBigOrSmall 
{
	public   List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
		List<Boolean> result=new ArrayList<>();
        int maxnum=candies[0];
        for(int i=0;i<candies.length;i++)
        {
        	if(maxnum<candies[i])
        	{
        		maxnum=candies[i];
        	}

        }
        
        for(int i=0;i<candies.length;i++)
        {
        	result.add(candies[i]+extraCandies>=maxnum);
        }
        return result;
    }
	public static void main(String[] args) {
		RetrunBigOrSmall ref=new RetrunBigOrSmall();
		int [] candies= {2,3,5,1,3};
		int extracan=3;
		List<Boolean> finalans=ref.kidsWithCandies(candies,extracan);
		System.out.println(finalans);
	}
}
