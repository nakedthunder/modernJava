package practical.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        Stream<Integer> numberStream = numbers.stream();

        Stream<Integer> evenNumbers = numberStream.filter(n -> n % 2 ==0);

        evenNumbers.forEach(System.out::println);

    }
}
