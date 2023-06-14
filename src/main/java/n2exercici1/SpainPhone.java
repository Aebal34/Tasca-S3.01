package n2exercici1;

public class SpainPhone implements Phone{

	private static final String prefix = "+34 ";

	@Override
	public String createPhoneNumber(String number) {
		return prefix + number;
	}
}
