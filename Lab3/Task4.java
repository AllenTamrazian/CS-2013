package Lab3;


public class Task4 {
	public static void main(String[] args ) {
		Integer[] list = {2,1,3,2,1};
		System.out.println(binarySearch(list, 3));
		 }
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key)
	{
		int low = 0;
		int high = list.length - 1;
		//
		while (high >= low) {
			int mid = (low + high / 2);
			if (key.compareTo(list[mid]) < 0)
				high = mid - 1;
			else if (key.compareTo(list[mid]) == 0)
				return mid;
			else
				low = mid + 1;
		}
		//if the number is not 1
		return -low - 1;
	}
	}