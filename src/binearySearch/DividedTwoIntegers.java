package binearySearch;

public class DividedTwoIntegers 
{
	public int divide(int divended,int divisor)
	{
		int result;
		result=divended/divisor;
		return result;
	}
 
	public static void main(String[] args) {
		
		DividedTwoIntegers ref=new DividedTwoIntegers();
		 System.out.println(ref.divide(-2147483648, -1));
	}
}
