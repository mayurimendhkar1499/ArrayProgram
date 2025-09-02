package BasicProgram;

public class DisplayAtoZ 
{
	public static void main(String[] args)
	{
		System.out.println("Display A to Z ");
		for(char ch='A'; ch<='Z'; ch++)
		{
			System.out.print(ch +" ");
		}
		System.out.println();
		System.out.println("Display a to z ");
		for(char ch1='a'; ch1<='z'; ch1++)
		{
			System.out.print(ch1 +" ");
		}
	}
}
