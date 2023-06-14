package n2exercici1;

public class ArgentinaAddress implements Address{
	
	final static String country = "ARGENTINA";
	
	@Override
	public String createAddress(String address) {
		return address+"\n"+country;
	}
}
