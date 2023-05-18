/*Allen Tamrazian
 * Lab 5
 * This code only prints out the occurences for each vowel in the lincoln.txt file
 * */
package Lab5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
	public static void main(String[] args) throws Exception{
		// Set text in a string
		Path fileName= Path.of("/Users/allentamrazian/eclipse-workspace/CS2013/jfx/src/Lab5/lincoln.txt");
		//store whole file in a String
	    String str = Files.readString(fileName);
	    //create new treemap
		Map<String, Integer> map = new TreeMap<>();
		//make an array with every letter as an element
		String[] words = str.split("(?!^)");
		//for each element in the array
	    for (int i = 0; i < words.length; i++) {
	      String key = words[i].toLowerCase();
	      //if the letter is a vowel
	      if (key.length() > 0 && (key.equals("a")|| key.equals("e")|| key.equals("i")|| key.equals("o")|| key.equals("u"))) {
	    	//if the map doesn't have the letter yet
	        if (!map.containsKey(key)) {
	            map.put(key, 1);
	          }
	        //if the map has the letter, increase its occurrence amount
	        else {
	        	//get the occurances for the letter and increase it
	            int value = map.get(key);
	            value++;
	            map.put(key, value);
	          }
	        }
	      }
		
		      map.forEach((k,v) -> System.out.println(k + " -------->" + v+" times"));
		    }
}
