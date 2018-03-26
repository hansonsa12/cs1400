

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class WordCountsActivity {
  // An ArrayList of words to ignore counting.
  private static ArrayList<String> ignoreWords = new ArrayList<>(
      Arrays.asList(
          "A", "AN", "THE", "IS", "ARE", "BE", "WAS", "WERE", 
          "DO", "DOES", "AND", "OR", "OF", "ON", "IN", "WOULD", 
          "CAN", "ALSO", "WITH", "ANY", "FOR", "WILL", "OF"
      ));

  public static void main(String[] args) {
    // TODO: define two HashMaps for recording counts: 
    //        1. countPerWord (pairs of string and integer) 
    //        2. countPerLetter (pairs of character and integer).
    HashMap<String,Integer> countPerWord = new HashMap<>();
    HashMap<Character,Integer> countPerLetter = new HashMap<>();
	  
	  
    // TODO: reading input text file
    Scanner in = null;
    
    try {
		in = new Scanner(new File("w_counts_IN.txt"));
		
		while(in.hasNextLine()) {
			String line = in.nextLine();
			String[] words = line.split("[^a-zA-Z]"); // by non-alphabet char
			for(String w: words) {
				if(!w.trim().equals("") && ignoreWords.contains(w.toUpperCase())) {
					// count here
				}
			}
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} finally {
		in.close();
	}
    
    // TODO: printing to output file
    
  }
}
