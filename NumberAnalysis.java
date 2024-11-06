import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberAnalysis
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new Random().ints(100, -999, 1000)
                .boxed()
                .collect(Collectors.toList());
        long positiveCount = numbers.stream()
                .filter(n -> n > 0)
                .count();
        long negativeCount = numbers.stream()
                .filter(n -> n < 0)
                .count();
        long twoDigitCount = numbers.stream()
                .filter(n -> Math.abs(n) >= 10 && Math.abs(n) < 100)
                .count();
        long mirrorCount = numbers.stream()
                .filter(NumberAnalysis::isMirrorNumber)
                .count();
        System.out.println("Num of positive integers: " + positiveCount);
        System.out.println("Num of negative nums: " + negativeCount);
        System.out.println("Num of two-digit nums: " + twoDigitCount);
        System.out.println("Num of mirror nums: " + mirrorCount);
    }
    private static boolean isMirrorNumber(int n)
    {
        String str = String.valueOf(Math.abs(n));
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
