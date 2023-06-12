package n1exercici1;

import java.util.*;

public class Undo {
	
	//Singleton's static instance
	private static Undo instance;
	
	private List<String> history = new ArrayList<String>();
	
	//Singleton's private constructor
	private Undo() {
		
	}
	
	public List<String> getHistory(){
		return history;
	}
	
	//Singleton's get instance, so the class is always the same and we can't have more than 1 instance of it
	public static Undo getInstance() {
		if(instance == null) {
			instance = new Undo();
		}
		return instance;
	}
	
	public void createState(String content) {
		history.add(content);
	}
	
	public void undoState() {
		
		if(history.size()-1 >= 0) {
			history.remove(history.size()-1);
		}
	}
}
