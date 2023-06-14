package n2exercici1;

public class Spain implements Agenda{

	@Override
	public String createPhoneNumber(String number) {
		return new SpainPhone().createPhoneNumber(number);
	}

	@Override
	public String createAddress(String address) {
		return new SpainAddress().createAddress(address);
	}
}
