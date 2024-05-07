package binearySearch;

public class StringToInteger 
{
public void  myAtoi(String s)
{
	int x=Integer.parseInt(s);
	System.out.println(x);
	
}
public static void main(String[] args) {
	StringToInteger ref=new StringToInteger();
	String s="   -142";
	ref.myAtoi(s);
}
}
