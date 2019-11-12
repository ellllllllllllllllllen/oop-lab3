package by.bntu.fitr.povt.zavadskaya.labs.lab3.logic;

public class Dinosaur {
	static int kilo = 1000;
	static int centner = 100000;

	public static float convertToKilogram(float weight) {
		return weight / kilo;
	}

	public static float convertToCentner(float weight) {
		return weight / centner;
	}

}
