package n1exercici1;

public class App {
	public static void main(String[] args) {
		
		boolean flag = true;
		while(flag) {
			
			Undo.getInstance().createState(Input.readString("Write something:"));
			if(Input.readYesOrNo("Do you want to undo?")) {
				Undo.getInstance().undoState();
			}
			System.out.println("Your history is as follows: ");
			for (String content : Undo.getInstance().getHistory()) {
				System.out.println(content);
			}
			if(!Input.readYesOrNo("Do you want to keep writing? y/n")) {
				flag = false;
			}
		}
	}
}
