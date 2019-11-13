package interpreterPackage;

public class Interpreter {

	public String givenData;
	
	public Interpreter() {
		givenData = new String();
	}
	
	public Interpreter(String data) {
		this.givenData = data;
	}
	
	public void setData(String data) {
		this.givenData = data;
	}
	
	public String interpret(String data) {
		TemperatureExpression expression = null;
		String[] dividedData = data.split(" ");
		double temperature = Double.valueOf(dividedData[0]); 
		String auxString = null;
		
		if(data.contains("Celsius") || data.contains("celsius")) {
			expression = new CelsiusTemperature(temperature);
			auxString = expression.tempToFahrenheitDegrees(temperature) +
					expression.tempToKelvinDegrees(temperature);
		} else if(data.contains("Kelvin") || data.contains("kelvin")) {
			expression = new KelvinTemperature(temperature);
			auxString = expression.tempToCelsiusDegrees(temperature) +
					expression.tempToFahrenheitDegrees(temperature);
		} else if(data.contains("Fahrenheit") || data.contains("fahrenheit")) {
			expression = new FahrenheitTemperature(temperature);
			auxString = expression.tempToCelsiusDegrees(temperature) +
					expression.tempToKelvinDegrees(temperature);
		}
		
		return auxString;
	}
}
