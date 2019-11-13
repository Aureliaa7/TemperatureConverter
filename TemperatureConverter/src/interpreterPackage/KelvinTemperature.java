package interpreterPackage;

public class KelvinTemperature implements TemperatureExpression {

	private double temperature;
	
	public KelvinTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public String tempToCelsiusDegrees(double givenData) {
		return ((this.temperature - 273.15) + " Celsius degrees\n");
	}

	public String tempToKelvinDegrees(double givenData) {
		return (this.temperature + " Kelvin degrees\n");
	}

	public String tempToFahrenheitDegrees(double givenData) {
		return ((this.temperature * 9/5 - 459.67) + " Fahrenheit degrees\n");
	}

}
