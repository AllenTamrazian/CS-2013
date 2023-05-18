package Lab2;

import java.util.Scanner;

public class Task6 {
	public static void reverseDisplay(int value) // reverseDisplay(1234) displays 4321
	{
		StringBuffer sb = new StringBuffer(String.valueOf(value));
		//reverse the word
		String reversedNumbers=sb.reverse().toString();
		System.out.println(reversedNumbers);
	}
	public static void reverseDisplay(String value) // reverseDisplay("abcd") displays "dcba"
	{
		StringBuffer sb = new StringBuffer(value);
		//reverse the word
		String reversedCharacters=sb.reverse().toString();
		System.out.println(reversedCharacters);
	}
	public static int count(String str, char a) //count char a in String str
	{
		int counter=0;
		//turn word into array
		char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            //if the character is the character we are looking for:
            if(ch[i]==a)
            {
            	counter++;
            }
        }
        return counter;
	}
	public static int sumDigits(long n) //sumDigits(111) returns 3
	{
		//get the length of n
		int sumLength = String.valueOf(n).length();
		//turn n into a string
		String sumStringed=String.valueOf(n);
		int total=0;
		for (int i = 0; i < sumLength; i++) {
			//split string into individual characters
            String singleDigit=sumStringed.substring(i, i+1);
            //get the characters and convert them back into integers
            int singleDigitInteger=Integer.parseInt(singleDigit);
            //add them to the total
            total=total+singleDigitInteger;
        }
		return total;
	}
	public static void main(String[] args)
	{
		reverseDisplay(3);
		reverseDisplay("abcd");
		System.out.println(count("aaaaaaaaaa", 'a'));
		System.out.println(sumDigits(111111));
	}
}
