package n3exercici1;

public class CarStartUpCommand implements ICommand{

	private Car car;

	public CarStartUpCommand(Car car) {
		
		this.car = car;
	}
	
	@Override
	public void execute() {
		car.startUp();
	}

	@Override
	public void unexecute() {
		car.turnOff();
	}
}
