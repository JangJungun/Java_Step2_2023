package chapter10;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		/*
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		*/
		driver.drive(new Bus());
		driver.drive(new Taxi());
		
		
	}

}
