package n2exercici1;

public class Argentine implements Person{ //AbstractFactory1

	@Override
	public String createPhoneNumber(String number) {
		return new ArgentinaPhone().createPhoneNumber(number);
	}

	@Override
	public String createAddress(String address) {
		return new ArgentinaAddress().createAddress(address);
	}
}
