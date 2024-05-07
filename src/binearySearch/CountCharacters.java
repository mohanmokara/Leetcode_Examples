package binearySearch;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters 
{

	public void countchar(char []ch)
	{
		Map<Character, Integer> frequencyMap = new HashMap<>();
		 for (char chars : ch) {
	            frequencyMap.put(chars, frequencyMap.getOrDefault(chars, 0) + 1);
	        }
		 System.out.println(frequencyMap);
		
	}
	
	 public static void main(String[] args) {
		 CountCharacters ref=new CountCharacters();
		 char[]ch= {'a','a','b','b'};
		 ref.countchar(ch);
	}
	
}
