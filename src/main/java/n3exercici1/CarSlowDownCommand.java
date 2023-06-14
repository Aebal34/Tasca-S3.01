package n3exercici1;

public class CarSlowDownCommand implements ICommand{

	private Car car;

	public CarSlowDownCommand(Car car) {
		
		this.car = car;
	}
	
	@Override
	public void execute() {
		car.slowDown();
	}

	@Override
	public void unexecute() {
		car.accelerate();
	}
}
