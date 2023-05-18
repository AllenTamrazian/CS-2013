/*
 Allen Tamrazian
 Lab 8 Task 1
 This code implements a generic method for merge sort using public static <E extends Compareable<E>>void mergeSort(E[] list)
*/
package Lab8;

public class Task3 {
	 /** The method for sorting the numbers */
	public static <E extends Comparable<E>>void mergeSort(E[] list){
	    if (list.length > 1) {
	    // Merge sort the first half
	    //create empty E[]? (didn't work and can't figure out how to do this
	    	E[] firstHalf = (E[]) new Comparable[list.length/2];
		    System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
		    mergeSort(firstHalf);
		    // Merge sort the second half 
			E[] secondHalf = (E[]) new Comparable[list.length - list.length / 2];
	    mergeSort(secondHalf); 
	 // Merge firstHalf with secondHalf into list 
	    	merge(firstHalf, secondHalf, list); 
	    }
	}
	/** Merge two sorted lists */ 
	public static <E extends Comparable<E>>void merge(E[] list1, E[] list2, E[] temp) {
	int current1 = 0; // Current index in list1 
	int current2 = 0; // Current index in list2 
	int current3 = 0; // Current index in temp 
	while (current1 < list1.length && current2 < list2.length) {
		if (list1[current1].compareTo(list2[current2]) < 0)
			temp[current3++] = list1[current1++]; 
		else 
			temp[current3++] = list2[current2++]; 
		}
	 while (current1 < list1.length)
	temp[current3++] = list1[current1++]; 
	while (current2 < list2.length)
			temp[current3++] = list2[current2++]; 
		}
	/** A test method */ 
	public static void main(String[] args) {
	Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
	mergeSort(list); 
	for (int i = 0; i < list.length; i++)
	System.out.print(list[i] + " ");
	}
}
