package n2exercici1;

public class ArgentinaPhone implements Phone{

	private static final String prefix = "+54-";

	@Override
	public String createPhoneNumber(String number) {
		return prefix + number;
	}
}
