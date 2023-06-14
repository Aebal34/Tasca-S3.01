package n3exercici1;

public class App {

	public static void main(String[] args) {
		
		//We implement a parking for each kind of vehicle
		//First we instantiate some vehicles
		Car mercedes = new Car();
		Bicycle bmx = new Bicycle();
		Plane commercialPlane = new Plane();
		Ship greatBoats = new Ship();
		
		Parking carParking = new Parking(new CarStartUpCommand(mercedes),
											new CarAccelerateCommand(mercedes),
											new CarSlowDownCommand(mercedes));
		
		//Now our carParking can call the command methods execute or unexecute to
		//do or undo certain actions for the car we decided to invoke on it.
		carParking.startUp(true);
		carParking.accelerate(true);
		carParking.accelerate(false);
		carParking.startUp(false);
		

	}

}
