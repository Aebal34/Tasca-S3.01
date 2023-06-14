package n3exercici1;

public class PlaneSlowDownCommand implements ICommand{

	private Plane plane;

	public PlaneSlowDownCommand(Plane plane) {
		
		this.plane = plane;
	}
	
	@Override
	public void execute() {
		plane.slowDown();
	}

	@Override
	public void unexecute() {
		plane.accelerate();
	}
}
