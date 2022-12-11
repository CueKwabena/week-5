package oop;


public class SpacedLogger implements Logger {

	
	public void Log(String log) {
		char y;
		for (int i = 0; i < log.length();i++) {
			y = log.charAt(i);
			System.out.print(y +" ");
		}
		System.out.println();
	}

	
	public void Error(String log) {
		char y;
		System.out.print("ERROR:");
		for (int i = 0; i < log.length();i++) {
			y = log.charAt(i);
			System.out.print(y +" ");
		}
		
	}
	

}
