package n2exercici1;

public class SpainAddress implements Address{

	final static String country = "SPAIN";
	
	@Override
	public String createAddress(String address) {
		return address+"\n"+country;
	}
}
