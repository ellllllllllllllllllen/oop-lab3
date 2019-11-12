package by.bntu.fitr.povt.zavadskaya.labs.lab3.logic;

public class Sweets {

	public static float pricePerKilogramOfChocolates(float chocolates_price, float chocolates) {
		return chocolates_price / chocolates;
	}

	public static float pricePerKilogramOfGelatines(float gelatines_price, float gelatines) {
		return gelatines_price / gelatines;
	}

	public static float priceRelation(float chocolates_price, float gelatines_price, float chocolates,
			float gelatines) {
		return (chocolates_price / chocolates) / (gelatines_price / gelatines);
	}
}
