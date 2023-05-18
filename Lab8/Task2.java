/*
 Allen Tamrazian
 Lab 8 Task 1
 This code implements a generic method for bubble sort using public static <E extends Compareable<E>>void bubbleSort(E[] list)
*/
package Lab8;

import java.util.Arrays;

public class Task2 {
	 /** Bubble sort method */
	public static <E extends Comparable<E>>void bubbleSort(E[] list){
	 boolean needNextPass = true;
	   for (int k = 1; k < list.length && needNextPass; k++) {
	   // Array may be sorted and next pass not needed
	     needNextPass = false; 
	 for (int i = 0; i < list.length - k; i++) {
	if (list[i].compareTo(list[i+1])>0) {
	// Swap list[i] with list[i + 1] 
	E temp = list[i];
	list[i] = list[i + 1];
	list[i + 1] = temp;
	needNextPass = true; // Next pass still needed 
	}
	}
	}
	   System.out.print(Arrays.toString(list));
	}
	public static void main(String[] args) {
		Integer[] list = {2,1,3,2,1};
		bubbleSort(list);
	}
}