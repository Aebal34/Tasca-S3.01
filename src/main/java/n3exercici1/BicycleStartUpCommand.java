package n3exercici1;

public class BicycleStartUpCommand implements ICommand{

	private Bicycle bike;

	public BicycleStartUpCommand(Bicycle bike) {
		
		this.bike = bike;
	}
	
	@Override
	public void execute() {
		bike.startUp();
	}

	@Override
	public void unexecute() {
		bike.turnOff();
	}
}
