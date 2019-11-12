package by.bntu.fitr.povt.zavadskaya.labs.lab3.view;

import java.util.Scanner;

public class Input {

	private static Scanner scanner = new Scanner(System.in);

	public static float input(String message) {
		System.out.println(message);
		return scanner.nextFloat();

	}
}
