package entities;

public class KeyboardFactory {
	
	public KeyboardFactory() {
	};

	public IKeyboard getKeyboard(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("MEMBRANE")) {
			return new Membrane();
		} else if (type.equalsIgnoreCase("MECHANIC")) {
			return new Mechanic();
		}
		return null;
	}
	
}
