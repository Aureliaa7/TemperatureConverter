package interpreterPackage;

public class CelsiusTemperature implements TemperatureExpression {

	private double temperature; 
	
	public CelsiusTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public String tempToCelsiusDegrees(double givenData) {
		return (this.temperature + " Celsius degrees \n");
	}

	public String tempToKelvinDegrees(double givenData) {
		return (this.temperature + 273.15 + " Kelvin degrees\n");
	}

	public String tempToFahrenheitDegrees(double givenData) {  
		return (this.temperature * 9/5 + 32 + " Fahrenheit degrees\n");
	}

}
