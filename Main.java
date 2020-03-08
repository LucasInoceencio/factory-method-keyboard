package entities;

public class Main {

	public static void main(String[] args) {
		
		KeyboardFactory keyboardFactory = new KeyboardFactory();
		
		IKeyboard keyboard1 = keyboardFactory.getKeyboard("Membrane");
		keyboard1.viewInfo();
		
		IKeyboard keyboard2 = keyboardFactory.getKeyboard("Mechanic");
		keyboard2.viewInfo();

	}

}
