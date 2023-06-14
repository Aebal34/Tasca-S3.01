package n3exercici1;

public class PlaneAccelerateCommand implements ICommand{

	private Plane plane;

	public PlaneAccelerateCommand(Plane plane) {
		
		this.plane = plane;
	}
	
	@Override
	public void execute() {
		plane.accelerate();
	}

	@Override
	public void unexecute() {
		plane.slowDown();
	}
}
