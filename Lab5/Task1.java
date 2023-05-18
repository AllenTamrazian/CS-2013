/*Allen Tamrazian
 * Lab 5
 * This code only prints out the words that occur only once in the lincoln.txt file
 * */
package Lab5;


import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;

public class Task1 {
	public static void main(String[] args) throws Exception{
		 
		Writer wr = new FileWriter("/Users/allentamrazian/eclipse-workspace/CS2013/jfx/src/Lab5/lincoln.txt");
		//store whole file in a String
        //create new treemap
	    Map<String, Integer> map = new TreeMap<>();
	    //make an array with every word as an element
	    String[] words = str.split("[\\s+\\p{P}]");
	    //for each element in the array
	    for (int i = 0; i < words.length; i++) {
	    	//the key is the ith element in lowercase
	      String key = words[i].toLowerCase();
	      if (key.length() > 0) {
	    	  //if the map doesn't have the word yet
	        if (!map.containsKey(key)) {
	            map.put(key, 1);
	          }
	        //if the map has the word, increase its occurrence amount
	        else {
	          int value = map.get(key);
	          //get the occurances for the key and increase it
	          value++;
	          map.put(key, value);
	        }
	         
	      }
	    }
	    //for each value of map that has an occurence of 1, print it out
	      map.forEach((k,v) ->{
		      if(v==1)
		      {
		    	  System.out.println(k + " -------->" + v+" times");
		      }
		    	 ;
		      });
	}
}