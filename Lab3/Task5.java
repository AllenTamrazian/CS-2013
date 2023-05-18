package Lab3;

import java.util.Arrays;

public class Task5 {
	public static <E extends Comparable<E>> void sort(E[] list)
	{
		int n = list.length;
	    //for the length of the list
        for(int  i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++)
            	//if the j element is greater than the next one
                if(list[j].compareTo(list[j+1]) > 0){
                    E temp = list[j];
                //make the greater element the one after the lesser one
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
        }
	}
	public static void main(String[] args ) {
		Integer[] list = {2,1,3,2,1};
		sort(list);
		System.out.print(Arrays.toString(list));
	}
}