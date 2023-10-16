import java.util.Random;

public class WeatherPrediction {
    public static void main(String[] args) {
        double temperature = generateRandomTemperature();
        String weatherCondition = predictWeather(temperature);

        System.out.println("Today's Temperature: " + temperature + "°C");
        System.out.println("Weather Condition: " + weatherCondition);
    }

    public static double generateRandomTemperature() {
        // Simulate a random temperature between -10°C and 40°C for demonstration.
        Random random = new Random();
        return -10 + (random.nextDouble() * 50);
    }

    public static String predictWeather(double temperature) {
        if (temperature < 0) {
            return "Freezing";
        } else if (temperature >= 0 && temperature < 10) {
            return "Cold";
        } else if (temperature >= 10 && temperature < 20) {
            return "Cool";
        } else if (temperature >= 20 && temperature < 30) {
            return "Warm";
        } else {
            return "Hot";
        }
    }
}
