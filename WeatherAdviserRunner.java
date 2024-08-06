
public class WeatherAdviserRunner {

	public static void main(String[] args)
	{
		WeatherAdviser obj = new WeatherAdviser();
		String advise = obj.provideWeatherAdvisory(30);
		System.out.println(advise);
	}

}
