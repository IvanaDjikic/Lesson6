package exercises;

import java.util.ArrayList;
import java.util.Random;

/* 
 * Make 2 ArrayLists; 
 *      1 full of adjectives (e.g. slimy, blind)
 *      1 full of plural nouns (e.g. pants, bones)
 *      
 * When the program is run, one word is randomly selected from each list to generate a band name.
*/
public class BandNameGenerator {
	public static void main(String[] args) {
		ArrayList<String> adjectives = new ArrayList<String>();
		adjectives.add("pretty");
		adjectives.add("dumb");
		adjectives.add("sleepy");
		adjectives.add("crazy");
		adjectives.add("slimy");
		adjectives.add("nice");
		adjectives.add("fast");

		ArrayList<String> nouns = new ArrayList<String>();
		nouns.add("books");
		nouns.add("ducks");
		nouns.add("politicians");
		nouns.add("cats");
		nouns.add("cars");
		nouns.add("chairs");
		nouns.add("movies");

		Random r = new Random();
		int x = adjectives.size();

		int y = nouns.size();

		String adj = adjectives.get(r.nextInt(x));
		String noun = nouns.get(r.nextInt(y));

		System.out.println(adj + " " + noun);

	}

}
