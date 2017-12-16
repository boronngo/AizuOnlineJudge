package AOJ0029;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Text text = new Text();
		String input = "";

		while (scan.hasNext()) {
			input = scan.next();
			text.addWord(input);
		}

		System.out.println(text.mostFreq() + " " + text.maxletters());
		scan.close();
	}

}

class Text {
	private ArrayList<String> word = new ArrayList<String>();

	public void addWord(String str) {
		word.add(str);
	}

	public String maxletters() {
		String maxword = "";
		int max = 0;

		for (String str : word) {
			if (str.length() > max) {
				max = str.length();
				maxword = str;
			}
		}

		return maxword;
	}

	public String mostFreq() {
		HashMap<String, Integer> wordmap = new HashMap<String, Integer>();
		String freq = "";
		int times = 0;

		for (String str : word) {
			if (wordmap.containsKey(str)) {
				wordmap.put(str, wordmap.get(str) + 1);
			} else {
				wordmap.put(str, 1);
			}
		}

		for (String key : wordmap.keySet()) {
			if (wordmap.get(key) > times) {
				times = wordmap.get(key);
				freq = key;
			}
		}

		return freq;
	}
}
