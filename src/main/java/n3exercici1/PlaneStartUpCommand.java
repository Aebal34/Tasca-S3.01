package n3exercici1;

public class PlaneStartUpCommand implements ICommand{

	private Plane plane;

	public PlaneStartUpCommand(Plane plane) {
		
		this.plane = plane;
	}
	
	@Override
	public void execute() {
		plane.startUp();
	}

	@Override
	public void unexecute() {
		plane.turnOff();
	}
}
