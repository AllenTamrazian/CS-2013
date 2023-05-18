package Lab3;

public class Task3 {
	public static void main(String[] args ) {
		Integer[] integers = {2,1,3,2,1};
		 System.out.println(max(integers));
		 }
	public static <E extends Comparable<E>> E max(E[] list) {
		//start with the max, which is the first element
		E max = list[0];
		//go through the whole list
        for (int i = 1; i < list.length; i++) {
            E element = list[i];
            //if the element in the list is greater than the max
            if (element.compareTo(max) > 0) {
            	//make it the new max
                max = element;
            }
        }

        return max;
		}
    }