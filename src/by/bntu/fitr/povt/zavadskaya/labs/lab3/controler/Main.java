package by.bntu.fitr.povt.zavadskaya.labs.lab3.controler;

import by.bntu.fitr.povt.zavadskaya.labs.lab3.logic.Cities;
import by.bntu.fitr.povt.zavadskaya.labs.lab3.logic.Dinosaur;
import by.bntu.fitr.povt.zavadskaya.labs.lab3.logic.File;
import by.bntu.fitr.povt.zavadskaya.labs.lab3.logic.Sweets;
import by.bntu.fitr.povt.zavadskaya.labs.lab3.logic.Variables;
import by.bntu.fitr.povt.zavadskaya.labs.lab3.view.Input;
import by.bntu.fitr.povt.zavadskaya.labs.lab3.view.Output;

public class Main {

	public static void main(String[] args) {

		float grams = Input.input("Input dinosaur weight in grams: ");
		Output.output(grams, Dinosaur.convertToKilogram(grams), Dinosaur.convertToCentner(grams));

		float bytes = Input.input("\nInput file size in bytes: ");
		Output.output(bytes, File.convertToKilobytes(bytes), File.convertToMegabytes(bytes));

		float centemeters = Input.input("\nInput distance between cities in centemeters: ");
		Output.output(centemeters, Cities.convertToMeters(centemeters), Cities.convertToKilometers(centemeters));

		float a = Input.input("\nInput a: ");
		float b = Input.input("Input b: ");
		Output.variables(Variables.replaceAWithB(a, b), Variables.replaceBWithA(a, b));

		float chocolates = Input.input("Input the number of kilograms of chocolates: ");
		float chocolates_price = Input.input("How much does it cost? ");
		float gelatines = Input.input("Input the number of kilograms of gelatines: ");
		float gelatines_price = Input.input("How much does it cost? ");

		Output.output(Sweets.pricePerKilogramOfChocolates(chocolates_price, chocolates),
				Sweets.pricePerKilogramOfGelatines(gelatines_price, gelatines),
				Sweets.priceRelation(chocolates_price, gelatines_price, chocolates, gelatines));

	}
}
