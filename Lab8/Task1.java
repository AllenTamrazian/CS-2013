/*
 Allen Tamrazian
 Lab 8 Task 1
 This code implements a generic method for insertion sort using public static <E extends Compareable<E>>void insertionSort(E[] list
*/
package Lab8;

import java.util.Arrays;

public class Task1 {
	public static <E extends Comparable<E>>void insertionSort(E[] list)
	{
		 int n = list.length;         
		 for (int i = 1; i < n; i++) { 
		//var to to swap j+1 and j
		  E temp = list[i];            
		  int j = i - 1; 
		  //if j+1 is less than j, swap j and j+1
		 while (j >= 0 && temp.compareTo(list[j]) < 0) {                 
		 list[j + 1] = list[j];                
		  j--;             }
		 list[j + 1] = temp;         }
		 System.out.print(Arrays.toString(list));}
	public static void main(String[] args)
	{
		Integer[] list = {2,1,3,2,1};
		insertionSort(list);
	}
}