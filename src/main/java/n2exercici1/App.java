package n2exercici1;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		//We create an argentine factory to produce address and phone from there
		Argentina argentineFactory = new Argentina();
		//We create a spanish factory to produce address and phone from there
		Spain spanishFactory = new Spain();
		
		//Now we create phone numbers for both countries
		String alejandroNumber = argentineFactory.createPhoneNumber("(11)6664 8597");
		String manuelNumber = spanishFactory.createPhoneNumber("687652341");
		
		//Now we create addresses for both countries
		String alejandroAddress = argentineFactory.createAddress("Calle Mendoza 35, Piso 3, B1636FDA, Buenos Aires");
		String manuelAddress = spanishFactory.createAddress("Calle Atapuerca 53, 61821, Mérida, Badajoz");
		
		//And now we can even store them in a hashMap pairing phone with address
		HashMap<String, String> agenda = new HashMap<String, String>();
		agenda.put(alejandroNumber, alejandroAddress);
		agenda.put(manuelNumber, manuelAddress);
		
		System.out.println(agenda);
		

	}

}
