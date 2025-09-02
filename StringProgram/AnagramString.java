package StringProgram;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args)
	{
		String str1="listen";
		String str2="Silent";
		
		char str1ch[]=str1.toLowerCase().toCharArray();
		char str2ch[]=str2.toLowerCase().toCharArray();
		
	    Arrays.sort(str1ch);
	    System.out.println(str1ch);
	    Arrays.sort(str2ch);
	    System.out.println(str2ch);
	    
	    if(Arrays.equals(str1ch, str2ch))
	    {
	    	System.out.println("Both strings are anagram ");
	    }
	    else
	    {
	    	System.out.println("Both strings are not anagram ");
	    }
		
	}

}
