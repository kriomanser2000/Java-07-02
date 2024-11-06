import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Proectr1
{
    public static void main(String[] args)
    {
        List<Proectr> projectors = Arrays.asList(
                new Proectr("Epson X123", 2024, 5000.0, "Epson"),
                new Proectr("BenQ HT2050", 2023, 4500.0, "BenQ"),
                new Proectr("Sony VPL-VW290ES", 2024, 8000.0, "Sony"),
                new Proectr("LG HU810P", 2022, 7000.0, "LG"),
                new Proectr("Epson EH-TW9400", 2023, 6000.0, "Epson")
        );
        System.out.println("All projectors:");
        projectors.forEach(System.out::println);
        String manufacturer = "Epson";
        System.out.println("\nProjectors by manufacturer " + manufacturer + ":");
        projectors.stream()
                .filter(p -> p.getManufacturer().equals(manufacturer))
                .forEach(System.out::println);
        int currentYear = 2024;
        System.out.println("\nProjectors from the current year (" + currentYear + "):");
        projectors.stream()
                .filter(p -> p.getReleaseYear() == currentYear)
                .forEach(System.out::println);
        double priceThreshold = 5500.0;
        System.out.println("\nProjectors with a price above " + priceThreshold + ":");
        projectors.stream()
                .filter(p -> p.getPrice() > priceThreshold)
                .forEach(System.out::println);
        System.out.println("\nProjectors sorted by price(ascending): ");
        projectors.stream()
                .sorted(Comparator.comparingDouble(Proectr::getPrice))
                .forEach(System.out::println);
        System.out.println("\nProjectors sorted by price(descending): ");
        projectors.stream()
                .sorted(Comparator.comparingDouble(Proectr::getPrice).reversed())
                .forEach(System.out::println);
        System.out.println("\nProjectors sorted by release year(ascending): ");
        projectors.stream()
                .sorted(Comparator.comparingInt(Proectr::getReleaseYear))
                .forEach(System.out::println);
        System.out.println("\nProjectors sorted by release year(descending): ");
        projectors.stream()
                .sorted(Comparator.comparingInt(Proectr::getReleaseYear).reversed())
                .forEach(System.out::println);
    }
}
