package StringProgram;

import java.util.Scanner;

public class CountWords 
{
	public static void main(String[] args) 
	{
      
        String str=" Hey hi my name is mayuri";
 
        String[] words = str.trim().split(" ");
 
        System.out.println("Number of words in the string = "+words.length);
	}
}
