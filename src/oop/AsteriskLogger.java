package oop;

public class AsteriskLogger implements Logger{

	
	public void Log(String log) {
		log = "***" + log + "***";
		System.out.println(log);
	}

	
	public void Error(String log) {
		log = "***ERROR:" + log + "***";
		for (int i = 0; i< log.length();i++) {
		System.out.print("*");		
		}
		
		System.out.println("");
		System.out.println(log);
		
		for (int i = 0; i< log.length();i++) {
			System.out.print("*");		
			}
		System.out.println();
	}

	


}
