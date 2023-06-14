package n2exercici1;

public class Spaniard implements Person{

	@Override
	public String createPhoneNumber(String number) {
		return new SpainPhone().createPhoneNumber(number);
	}

	@Override
	public String createAddress(String address) {
		return new SpainAddress().createAddress(address);
	}
}
