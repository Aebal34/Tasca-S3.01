package n1exercici1;

public class App {
	public static void main(String[] args) {
		
		//We store the instance of Undo class to access to it quickly
		Undo undo = Undo.getInstance();
		boolean flag = true;
		while(flag) {
			
			undo.createState(Input.readString("Write something:"));
			if(Input.readYesOrNo("Do you want to undo?")) {
				undo.undoState();
			}
			System.out.println("Your history is as follows: ");
			for (String content : undo.getHistory()) {
				System.out.println(content);
			}
			if(!Input.readYesOrNo("Do you want to keep writing? y/n")) {
				flag = false;
			}
		}
	}
}
