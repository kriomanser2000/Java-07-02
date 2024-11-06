import java.util.*;
import java.util.stream.Collectors;

public class ProductManager
{
    public static void main(String[] args)
    {
        List<String> products = Arrays.asList("Молоко", "Хліб", "Сир", "Молоко", "Яйця", "М'ясо", "Молоко", "Олія", "Кефір", "Масло");
        System.out.println("Усі продукти:");
        products.forEach(System.out::println);
        System.out.println("\nЗ назвою менше п’яти символів: ");
        products.stream()
                .filter(p -> p.length() < 5)
                .forEach(System.out::println);
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведіть продукт для підрахунку: ");
        String userProduct = scanner.nextLine();
        long count = products.stream()
                .filter(p -> p.equalsIgnoreCase(userProduct))
                .count();
        System.out.println("Продукт '" + userProduct + "' зустрічається " + count + " разів.");
        System.out.print("\nВведіть першу букву продукту: ");
        String startingLetter = scanner.nextLine();
        System.out.println("Продукти, що починаються на букву '" + startingLetter + "':");
        products.stream()
                .filter(p -> p.startsWith(startingLetter))
                .forEach(System.out::println);
        System.out.println("\nПродукти із категорії 'Молоко':");
        products.stream()
                .filter(p -> p.equalsIgnoreCase("Молоко"))
                .forEach(System.out::println);
        scanner.close();
    }
}
