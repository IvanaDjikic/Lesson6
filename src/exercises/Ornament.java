package exercises;

import java.util.ArrayList;

/* 
 * Create a class called Decorator that contains an ArrayList called boxOfDecorations.
 *   1. In the Decorator class, hang all the ornaments in the box.
 *   2. Add a color to the Ornament class so that your program prints â€œHanging a red ornamentâ€�, etc.
 */

public class Ornament {
	String name;
	String color;

	public Ornament(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public void hang() {
		System.out.println("hanging an " + this.color + " ornament " + this.name);
	}

}
