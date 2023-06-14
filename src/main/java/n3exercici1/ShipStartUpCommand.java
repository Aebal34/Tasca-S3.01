package n3exercici1;

public class ShipStartUpCommand implements ICommand{

	private Ship ship;

	public ShipStartUpCommand(Ship ship) {
		
		this.ship = ship;
	}
	
	@Override
	public void execute() {
		ship.startUp();
	}

	@Override
	public void unexecute() {
		ship.turnOff();
	}
}
