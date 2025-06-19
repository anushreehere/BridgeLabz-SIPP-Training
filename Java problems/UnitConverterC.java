public class UnitConverterC {

    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double p) {
        return p * 0.453592;
    }

    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double g) {
        return g * 3.78541;
    }

    public static double convertLitersToGallons(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println("98°F to Celsius: " + convertFahrenheitToCelsius(98));
        System.out.println("37°C to Fahrenheit: " + convertCelsiusToFahrenheit(37));
        System.out.println("100 pounds to kg: " + convertPoundsToKilograms(100));
        System.out.println("45 kg to pounds: " + convertKilogramsToPounds(45));
        System.out.println("5 gallons to liters: " + convertGallonsToLiters(5));
        System.out.println("10 liters to gallons: " + convertLitersToGallons(10));
    }
}

