package Lab3;

import java.util.ArrayList;

public class Task6 {
	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(max(list));
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        E max = list.get(0);
        //for the list size
        for (int i = 1; i < list.size(); i++) {
        	//if the element in the list is greater than the max
            if (list.get(i).compareTo(max) > 0) {
            	//make it the new max
                max = list.get(i);
            }
        }

        return max;
    }
}
