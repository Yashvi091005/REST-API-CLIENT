import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class InteractiveWeatherClient {

    // Replace with your actual API key
    static final String API_KEY = "YOUR_API_KEY";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city;

        System.out.println("🌐 Welcome to CodTech Weather App (Java REST API Task)");

        while (true) {
            System.out.print("\n📍 Enter city name (or type 'exit' to quit): ");
            city = scanner.nextLine();

            if (city.equalsIgnoreCase("exit")) {
                System.out.println("👋 Bye BOSS! Task 2 completed.");
                break;
            }

            getWeather(city);
        }

        scanner.close();
    }

    public static void getWeather(String cityName) {
        try {
            String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + cityName +
                    "&appid=" + API_KEY + "&units=metric";

            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            int responseCode = conn.getResponseCode();

            if(responseCode == 200){
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(conn.getInputStream())
                );

                StringBuilder response = new StringBuilder();
                String line;

                while((line = reader.readLine()) != null){
                    response.append(line);
                }
                reader.close();

                // Parse JSON response
                JSONObject jsonObj = new JSONObject(response.toString());

                String weather = jsonObj.getJSONArray("weather").getJSONObject(0).getString("description");
                JSONObject main = jsonObj.getJSONObject("main");
                double temp = main.getDouble("temp");
                double feelsLike = main.getDouble("feels_like");

                System.out.println("\n🌤️ Weather Info for " + cityName.toUpperCase() + ":");
                System.out.println("Temperature: " + temp + "°C");
                System.out.println("Feels Like: " + feelsLike + "°C");
                System.out.println("Condition: " + weather);
            } else {
                System.out.println("❌ City not found or API error. Please check the name or try again.");
            }

        } catch (Exception e) {
            System.out.println("🚫 Error: " + e.getMessage());
        }
    }
}
