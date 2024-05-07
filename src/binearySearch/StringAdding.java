package binearySearch;

public class StringAdding 
{
	 public String mergeAlternately(String word1, String word2) 
	    {
	        int length1=word1.length();
	        int length2=word2.length();
	        int maxlength=Math.max(length1,length2);
	        StringBuilder bui=new StringBuilder();
	        for(int i=0;i<maxlength;i++)
	        {
	         if(i<length1)
	         {
	             bui.append(word1.charAt(i));
	         }   
	         if(i<length2)
	         {
	             bui.append(word2.charAt(i));
	         } 
	        }
	        return bui.toString();
	    }
	     public static void main(String[] args) {
	    	 StringAdding ref=new StringAdding();
	    	 String word1="ab";
	    	 String word2="pqrs";
	    	  System.out.println(ref.mergeAlternately(word1, word2));
	    	 
		}
}
