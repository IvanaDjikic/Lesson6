package exercises;

import java.util.ArrayList;

import junit.framework.TestCase;

public class StringReversal extends TestCase {
	/*
	 * Without using the reverse() method in StringBuffer or StringBuilder, write a
	 * string reverser that will make this unit test pass.
	 * 
	 * Then use it to decode this message: QcXgW9w4wQd=v?hctaw/moc.ebutuoy
	 */

	String termToReverse;
	String reversedTerm;
	ArrayList<Character> chars = new ArrayList<Character>();
	ArrayList<Character> reversedChars = new ArrayList<Character>();

	String reverseMe(String termToReverse) {
		for (int i = 0; i < termToReverse.length(); i++) {

			chars.add(termToReverse.charAt(i));
		}
		for (int i = chars.size() - 1; i >= 0; i--) {
			reversedChars.add(chars.get(i));
		}
		reversedTerm = reversedChars.toString().replaceAll("[,\\s\\[\\]]", "");

		return reversedTerm;

	}
	
	public void test() {
		assertEquals("cellardoor", reverseMe("roodrallec"));
	}
	

}
