/*Allen Tamrazian
 * Lab 5
 * This code only prints out the occurences for each word in the lincoln.txt file
 * */
package Lab5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;

public class Task3 {
	public static void main(String[] args) throws Exception{
		 // Set text in a string
		Path fileName= Path.of("/Users/allentamrazian/eclipse-workspace/CS2013/jfx/src/Lab5/lincoln.txt");
		//store whole file in a String
        String str = Files.readString(fileName);
        //create new treemap
	    Map<String, Integer> map = new TreeMap<>();
	    //make an array with every word as an element
	    String[] words = str.split("[\\s+\\p{P}]");
	    //for each element in the array
	    for (int i = 0; i < words.length; i++) {
	      String key = words[i].toLowerCase();
	      if (key.length() > 0) {
	        //if the map doesn't have the word yet
	        if (!map.containsKey(key)) {
	            map.put(key, 1);
	          }
	        //if the map has the word, increase its occurrence amount
	        else {
	        //get the occurances for the key and increase it
	          int value = map.get(key);
	          value++;
	          map.put(key, value);
	        }
	      }
	    }
	    map.forEach((k,v) -> System.out.println(k + " -------->" + v+" times"));
	  }
}
