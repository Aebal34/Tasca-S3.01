package n3exercici1;

public class BicycleAccelerateCommand implements ICommand{

	private Bicycle bike;

	public BicycleAccelerateCommand(Bicycle bike) {
		
		this.bike = bike;
	}
	
	@Override
	public void execute() {
		bike.accelerate();
	}

	@Override
	public void unexecute() {
		bike.slowDown();
	}
}
