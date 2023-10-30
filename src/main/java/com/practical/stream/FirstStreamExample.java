package practical.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FirstStreamExample {
    public static void main(String[] args) {
        // 스트림 객체 생성
        List<String> firstList = new ArrayList<String>();
        firstList.add("1");
        firstList.add("2");
        firstList.add("3");
        firstList.add("4");

        // 스트림 객체 생성
        Stream<String> firstStream = firstList.stream();
        System.out.println("객체생성 스트림 카운트: " + firstStream.count());

        // IllegalStateException 오류 ==============================================
       /* Stream<String> limitedStream = firstStream.limit(3);
        System.out.println("제한된 스트림 갯수: " + limitedStream);*/

        // IllegalStateException 오류수정 코드  ======================================
        firstStream = firstList.stream();
        Stream<String> limitedStream = firstStream.limit(2);
        limitedStream.forEach(System.out::println);

        /*
         *  스트림의 특징
         *   1. 스트림은 한번 사용하고 나면 다시 사용할 수 없다.
         *   2. Stream 인터페이스의 메서드 중 void 를 리턴하는 메서드를 호출하면
         *   전체 스트림 데이터를 처리하기 때문에 데이터를 모두 소모하고 종료된다.
         *
         *   IllegalStateException 오류 이유
         *   - count는 스트림의 데이터를 다 흘려봐야지 알 수 있는 크기 구하기이기때문
         *   ? -> List와 같은 컬렉션은 모든 데이터가 객체 내부에 포함되어 있기 때문에 데이터 크기를 리턴하는 것이 큰 문제가 X
         *   - 스트림은 데이터 원천을 참조하는 형태로 총 건수를 계산하기위해 다 읽어 들인다..
         *
         *   최종연산
         *   - 스트림 데이터를 다 소모하게 만드는 메서드
         * */

    }

}
