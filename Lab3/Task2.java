package Lab3;


public class Task2 {
	public static void main(String[] args ) {
		Integer[] integers = {1, 2, 3, 4, 5};
		 System.out.println(linearSearch(integers, 1));
		 }
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        //look for the key
		for (int i = 0; i < list.length; i++) {
			//if key is found
            if (list[i].compareTo(key) == 0) {
                return i;
            }
        }
		//if the key is not found
        return -1;
    }
	}