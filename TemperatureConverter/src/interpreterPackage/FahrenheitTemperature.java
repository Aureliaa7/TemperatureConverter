package interpreterPackage;

public class FahrenheitTemperature implements TemperatureExpression {

	private double temperature;
	
	public FahrenheitTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public String tempToCelsiusDegrees(double givenData) {
		return ((this.temperature - 32) * 5/9 + " Celsius degrees\n");
	}

	public String tempToKelvinDegrees(double givenData) {
		return ((this.temperature + 459.67) * 5/9 + " Kelvin degrees\n");
	}

	public String tempToFahrenheitDegrees(double givenData) {
		return (this.temperature + " Fahrenheit degrees\n");
	}

}
