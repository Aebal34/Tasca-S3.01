package n1exercici1;

public class Undo {
	
	//Singleton's static instance
	private static Undo instance;
	
	//Singleton's private constructor
	private Undo() {
		
	}
	
	
	//Singleton's get intstance, so the class is always the same and we can't have more than 1 instance of it
	public static Undo getInstance() {
		if(instance == null) {
			instance = new Undo();
		}
		return instance;
	}
}
