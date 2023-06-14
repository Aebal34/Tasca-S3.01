package n3exercici1;

public class Parking {

	//The parking acts as the Invoker of the Command pattern
	private ICommand startUp;
	private ICommand accelerate;
	private ICommand slowDown;
	
	
	public Parking(ICommand startUp, ICommand accelerate, ICommand slowDown) {
		this.startUp = startUp;
		this.accelerate = accelerate;
		this.slowDown = slowDown;
	}
	
	public void startUp(Boolean execute) {
		if(execute) {
			this.startUp.execute();
		}else {
			this.startUp.unexecute();
		}
	}
	public void accelerate(Boolean execute) {
		if(execute) {
			this.accelerate.execute();
		}else {
			this.accelerate.unexecute();
		}
	}
	public void slowDown(Boolean execute) {
		if(execute) {
			this.slowDown.execute();
		}else {
			this.slowDown.unexecute();
		}
	}
}
