package BasicProgram;

import java.util.Scanner;

public class CalculateYearMonthWeek
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the days ");
		int days=sc.nextInt();
		int weeks,months,years;
		weeks=days/7;
		months=days/30;
		years=days/365;
		System.out.println(weeks +" weeks " + months + " months " + years +" years ");
	}
}
