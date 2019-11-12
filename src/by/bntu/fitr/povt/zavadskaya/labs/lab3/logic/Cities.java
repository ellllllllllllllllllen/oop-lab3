package by.bntu.fitr.povt.zavadskaya.labs.lab3.logic;

public class Cities {
	static int kilo = 100;
	static int meters = 100000;

	public static float convertToKilometers(float centemeters) {
		return centemeters / kilo;
	}

	public static float convertToMeters(float centemeters) {
		return centemeters / meters;
	}

}
