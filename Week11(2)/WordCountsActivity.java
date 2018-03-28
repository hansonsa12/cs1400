
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class WordCountsActivity {
	// An ArrayList of words to ignore counting.
	private static ArrayList<String> ignoreWords = new ArrayList<>(
			Arrays.asList("A", "AN", "THE", "IS", "ARE", "BE", "WAS", "WERE", "DO", "DOES", "AND", "OR", "OF", "ON",
					"IN", "WOULD", "CAN", "ALSO", "WITH", "ANY", "FOR", "WILL", "OF"));

	public static void main(String[] args) {
		// TODO: define two HashMaps for recording counts:
		// 1. countPerWord (pairs of string and integer)
		// 2. countPerLetter (pairs of character and integer).
		HashMap<String, Integer> countPerWord = new HashMap<>();
		HashMap<Character, Integer> countPerLetter = new HashMap<>();

		// TODO: reading input text file
		Scanner in = null;

		try {
			in = new Scanner(new File("w_counts_IN.txt"));

			while (in.hasNextLine()) {
				String line = in.nextLine().toUpperCase();

				System.out.println(line);

				String[] words = line.split("[^a-zA-Z]"); // by non-alphabet char

				System.out.println(Arrays.asList(words));

				for (String w : words) {
					if (!w.trim().equals("") && !ignoreWords.contains(w)) {
						// count here

						// counting word occurrences
						if (countPerWord.containsKey(w)) {
							countPerWord.put(w, countPerWord.get(w) + 1);
						} else {
							countPerWord.put(w, 1);
						}

						// counting how many words start with a letter
						char firstChar = w.charAt(0);
						if (countPerLetter.containsKey(firstChar)) {
							countPerLetter.put(firstChar, countPerLetter.get(firstChar) + 1);
						} else {
							countPerLetter.put(firstChar, 1);
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			in.close();
		}

		// TODO: printing to output file
		PrintWriter out = null;
		try {
			out = new PrintWriter("w_counts_OUT.txt");
			out.printf("%20s %10s\n", "WORD", "COUNT");
			for (String w : countPerWord.keySet()) {
				out.printf("%20s %10d\n", w, countPerWord.get(w));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			out.close();
		}

		PrintWriter fout = null;
		try {
			fout = new PrintWriter(new FileOutputStream("w_counts_OUT.txt", true));
			for (char c : countPerLetter.keySet()) {
				fout.print(c + " ");
				int count = countPerLetter.get(c);
				for (int i = 0; i < count; i++) {
					fout.print("*");
				}

				fout.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fout.close();
		}

	}
}