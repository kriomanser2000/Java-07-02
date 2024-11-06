import java.util.Arrays;
import java.util.List;

public class DeviceCl
{
    public static void main(String[] args)
    {
        List<Device> devices = Arrays.asList(
                new Device("Phone", 2022, 699.99, "Black", "Mobile"),
                new Device("Laptop", 2021, 999.99, "Silver", "Computer"),
                new Device("Tablet", 2020, 499.99, "White", "Mobile"),
                new Device("Smartwatch", 2022, 199.99, "Black", "Wearable"),
                new Device("Desktop", 2019, 799.99, "Black", "Computer")
        );
        System.out.println("All devices: ");
        devices.forEach(System.out::println);
        String color = "Black";
        System.out.println("\nDevices with color " + color + ":");
        devices.stream()
                .filter(device -> device.getColor().equalsIgnoreCase(color))
                .forEach(System.out::println);
        int year = 2022;
        System.out.println("\nDevices from year " + year + ":");
        devices.stream()
                .filter(device -> device.getYear() == year)
                .forEach(System.out::println);
        double price = 500.0;
        System.out.println("\nDevices more expensive than " + price + ":");
        devices.stream()
                .filter(device -> device.getPrice() > price)
                .forEach(System.out::println);
        String type = "Mobile";
        System.out.println("\nDevices of type " + type + ":");
        devices.stream()
                .filter(device -> device.getType().equalsIgnoreCase(type))
                .forEach(System.out::println);
        int startYear = 2020;
        int endYear = 2022;
        System.out.println("\nDevices released between " + startYear + " and " + endYear + ":");
        devices.stream()
                .filter(device -> device.getYear() >= startYear && device.getYear() <= endYear)
                .forEach(System.out::println);
    }
}