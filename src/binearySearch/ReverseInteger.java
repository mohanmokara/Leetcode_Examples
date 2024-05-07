package binearySearch;

public class ReverseInteger
{
public int reverse(int x)
{
	int second=0;
	int rem=0;
	 while(x!=0)
	 {
		 rem=x%10;
			second=second*10+rem;
			x=x/10;
	 }
  return second;
}
public static void main(String[] args) {
	ReverseInteger ref=new ReverseInteger();
	int x=120;
	 System.out.println(ref.reverse(x));
}
}
