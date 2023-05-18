/*
 Allen Tamrazian
 Lab 6 Task 2
 This code gets an input string and displays the maximum increasingly ordered sub-sequence of characters
 */
package Lab6;

import java.util.*;

public class Task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Insert a string");
		String enteredString = input.nextLine(); 
		//maximum consecutive increasingly ordered substring
		LinkedList<Character> maxConsecSubstring = new LinkedList<>();

		// Find the maximum increasingly ordered subsequence
		for (int i = 0; i < enteredString.length(); i++) { 
			LinkedList<Character> list = new LinkedList<>();
			list.add(enteredString.charAt(i));
			for (int j = i + 1; j < enteredString.length(); j++) {
				if (enteredString.charAt(j) > list.getLast()) {
					list.add(enteredString.charAt(j)); 
				}
			}
			
			if (list.size() > maxConsecSubstring.size()) {
				maxConsecSubstring.clear();
				maxConsecSubstring.addAll(list);
			}
			list.clear();
		}

		//display each character in the maxConsecSubstring
		for (Character ch: maxConsecSubstring) { // single loop
			System.out.print(ch); // Simple statement
		}
		System.out.println();
	}

}