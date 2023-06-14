package n3exercici1;

public class ShipAccelerateCommand implements ICommand{

	private Ship ship;

	public ShipAccelerateCommand(Ship ship) {
		
		this.ship = ship;
	}
	
	@Override
	public void execute() {
		ship.accelerate();
	}

	@Override
	public void unexecute() {
		ship.slowDown();
	}
}
