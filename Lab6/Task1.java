/*
 Allen Tamrazian
 Lab 6 Task 1
 This code gets an input string and displays the maximum consecutive increasingly ordered substring
 */
package Lab6;

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//maximum consecutive increasingly ordered substring
		LinkedList<Character> maxConsecSubstring = new LinkedList<>();
		//list for storing characters in string
		LinkedList<Character> list = new LinkedList<>();
		System.out.println("Insert a string");
		String enteredString= sc.nextLine();
		//make string lowercase
		enteredString=enteredString.toLowerCase();
		// Find the maximum increasingly ordered subsequence
		for (int i = 0; i < enteredString.length(); i++) {
			if (list.size() > 1 && enteredString.charAt(i) <= list.getLast() && list.contains(enteredString.charAt(i))) {
				list.clear();
			}

			list.add(enteredString.charAt(i));
			
			if (list.size() > maxConsecSubstring.size()) {
				maxConsecSubstring.clear();
				maxConsecSubstring.addAll(list);
			}
		}
		//display each character in the maxConsecSubstring
		for (Character ch: maxConsecSubstring) {
			System.out.print(ch);
		}
		System.out.println();
	}	
	}