package n3exercici1;

public class BicycleSlowDownCommand implements ICommand{

	private Bicycle bike;

	public BicycleSlowDownCommand(Bicycle bike) {
		
		this.bike = bike;
	}
	
	@Override
	public void execute() {
		bike.slowDown();
	}

	@Override
	public void unexecute() {
		bike.accelerate();
	}
}
