package exercises;

import java.util.ArrayList;

public class Decorator {
	public static void main(String[] args) {
		ArrayList<Ornament> boxOfDecorations = new ArrayList<Ornament>();
		boxOfDecorations.add(new Ornament("ball", "red"));
		boxOfDecorations.add(new Ornament("fairy", "yellow"));
		boxOfDecorations.add(new Ornament("dream catcher", "blue"));
		boxOfDecorations.add(new Ornament("flower", "green"));
		boxOfDecorations.add(new Ornament("bell", "white"));

		for (int i = 0; i < boxOfDecorations.size(); i++) {
			boxOfDecorations.get(i).hang();
		}
	}

}
