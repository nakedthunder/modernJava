package practical.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreatePractice {
    public static void main(String[] args) {
        // 빈 스트림 생성 : 요소 값이 존재하지 않는 빈 스트림 객체를 생성
        Stream<Object> emptyStream = Stream.empty();

        System.out.println("빈 스트림: " + emptyStream.count());

        // 컬렉션 스트림 생성: 컬렉션 값이 존재하는 스트림 객체를 생성
        List<String> strList = new ArrayList<>(Arrays.asList("a","b","c"));
        Stream<String> strStream = strList.stream();

        System.out.println("컬렉션 스트림: " + strStream.count());

        // 배열 스트림
        String[] strArr = {"a","b"};
        Stream<String> strStream2 = Arrays.stream(strArr);
        Stream<String> strStream3 = Stream.of(strArr);
        Stream<String> strStream4 = Stream.of("one", "two");
        System.out.println("strStream2 스트림: " + strStream2.count());
        System.out.println("strStream3 스트림: " + strStream3.collect(Collectors.toList()));
        System.out.println("strStream4 스트림: " + strStream4.collect(Collectors.toList()));

        // 빌더 스트림
        Stream<String> builderStream = Stream.<String>builder()
                .add("apple")
                .add("banana")
                .add("orange")
                .build();

        System.out.println("빌더 스트림: " + builderStream.collect(Collectors.toList()));
    }

}
