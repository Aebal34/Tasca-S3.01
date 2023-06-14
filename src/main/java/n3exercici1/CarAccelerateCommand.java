package n3exercici1;

public class CarAccelerateCommand implements ICommand{

	private Car car;

	public CarAccelerateCommand(Car car) {
		
		this.car = car;
	}
	
	@Override
	public void execute() {
		car.accelerate();
	}

	@Override
	public void unexecute() {
		car.slowDown();
	}
}
