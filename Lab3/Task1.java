package Lab3;

import java.util.ArrayList;

public class Task1 {
	public static void main(String[] args ) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		 list1.add(2);
		 list1.add(1);
		 list1.add(3);
		 list1.add(2);
		 list1.add(1);
		 System.out.println("The original list: "+(list1));
		 System.out.println("The duplicate removed list: "+removeDuplicates(list1));
		 }
	public static <E> ArrayList<E> removeDuplicates (ArrayList<E> list) {
		//make a new list that will have duplicates removed
		ArrayList<E> newList = new ArrayList<>();
		//go through all of the elements in the list
		for(int i = 0; i < list.size(); ++i) {
			//if the new list doesn't have it, add it
			if(!newList.contains(list.get(i))) {  
				newList.add(list.get(i));             
				}
			//return the new list
			}         return newList;     }
	}