package testAppPackage;

import interpreterPackage.*;

public class MainClass {

	public static void main(String[] args) {
		
		Interpreter interpreter = new Interpreter();
		UI frame = new UI();
		TemperatureInterpreterController controller = new TemperatureInterpreterController(interpreter, frame);
	}

}
