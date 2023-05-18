package Lab2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args)
	{
		
		try
		{
			//get input
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a nonnegative integer: ");
			int n = input.nextInt();
			//if input is nonnegative
			if(n>0 || n==0)
			{
				//end message
				System.out.println("The sum of all reciprocals from 0 to " + n + " is " + addIntegers(n));
			}
			//if input is negative
			else
			{
				System.out.println("That is not a nonnegative integer!");
			}
		}
		catch(Exception ex)
		{
			System.out.println("That is not a nonnegative integer!");
		}
		
	}
	public static double addIntegers(double n) {
		//base case
		if (n == 0)
		{
			return 0;
		}
		//every other case
		else
		{
			//add 1/itself to itself
			return 1/n + addIntegers(n-1);
		}
}
}
