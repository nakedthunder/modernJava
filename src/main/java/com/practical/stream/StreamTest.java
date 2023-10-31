package practical.stream;

import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[] {1,2,3,4,5};
        List numberList = Arrays.asList(intArray);

        // 초창기 방식
//        for(int i = 0; i < numberList.size(); i++) {
//            System.out.println("초창기 방식 :" + i);
//        }

        // 스트림 API 이용해 결과를 출력
        // - List 객체의 값을 처리하기 위해 for루프를 사용하지 않고도, 메서드 참조를 통해 println 메서드 출력
        numberList.forEach(System.out::println);
    }

}
