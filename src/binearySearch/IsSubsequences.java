package binearySearch;

import java.util.Arrays;

public class IsSubsequences
{
public boolean  ispresent(String s1,String t)
{
	boolean result=true;
	String [] str=s1.split("");
	String [] tar=t.split("");
	for(int i=0;i<str.length;i++)
	{
		for(int j=0;j<tar.length;j++)
		{
			if(str[i]==tar[j])
			{
				return result=true;
				
			}
			else
			{
				return result=false;
				
			}
		}
	}
	return result;
	
}
public static void main(String[] args) {
	IsSubsequences ref =new IsSubsequences();
	String s="abc";
	String t="ahbgdc";
	boolean finalres=ref.ispresent(s, t);
	System.out.println(finalres);
}
}
