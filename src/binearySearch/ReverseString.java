package binearySearch;

public class ReverseString
{
 public String reverword(String s)
 {
	 
	  s=s.trim();
	 String[] words=s.split("\\s+");
	 StringBuilder bui=new StringBuilder();
	 for(int i=words.length-1;i>=0;i--)
	 {
		 bui.append(words[i]);
		 if(i>0)
		 {
			 bui.append(" ");
		 }
	 }
	 return bui.toString();
	 
 }
 
 public static void main(String[] args) {
	 ReverseString rev=new ReverseString();
	 String  s= " hello world ";
	  System.out.println(rev.reverword(s));
	 
	 
}
}
