package by.bntu.fitr.povt.zavadskaya.labs.lab3.logic;

public class File {
	static int kilo = 1000;
	static int mega = 1000000;

	public static float convertToKilobytes(float bytes) {
		return bytes / kilo;
	}

	public static float convertToMegabytes(float bytes) {
		return bytes / mega;
	}

}
