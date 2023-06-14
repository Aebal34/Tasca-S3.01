package n3exercici1;

public class ShipSlowDownCommand implements ICommand{

	private Ship ship;

	public ShipSlowDownCommand(Ship ship) {
		
		this.ship = ship;
	}
	
	@Override
	public void execute() {
		ship.slowDown();
	}

	@Override
	public void unexecute() {
		ship.accelerate();
	}
}
