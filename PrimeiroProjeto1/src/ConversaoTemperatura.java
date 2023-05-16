public class ConversaoTemperatura {
    public static void main(String[] args) {
        double grausCelsius = 18;
        double grausFahrenheit = (grausCelsius * 1.8) + 32;

        System.out.println(String.format("A temperatura atual em graus Celsius é de %.1f e em graus Fahrenheit é de %.1f",grausCelsius,grausFahrenheit));
    }
}
