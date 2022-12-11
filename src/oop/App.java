package oop;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		AsteriskLogger logger = new AsteriskLogger();
		SpacedLogger logs = new SpacedLogger();
		
		logger.Log(input);
		logger.Error(input);
		
		logs.Log(input);
		logs.Error(input);

	}

}
