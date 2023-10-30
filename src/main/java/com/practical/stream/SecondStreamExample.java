package practical.stream;

import java.util.ArrayList;
import java.util.List;

public class SecondStreamExample {
    public static void main(String[] args) {
        List<String> firstList = new ArrayList<String>();
        firstList.add("1");
        firstList.add("2");
        firstList.add("3");
        firstList.add("4");


        /*
         *  1줄로 끝낸 이유
         *   - stream메서드와 limit메서드 모두 스트림 객체를 리턴하기 때문이다.
         *   - 리턴 받은 스트림 객체를 변수로 참조하는 것이 아니라 다른 메서드를 호출해서 연결시킬 수 있다.
         *   (중간연산 -> 최종 연산으로 종료)
         * */

        firstList.stream().limit(5).forEach(System.out::println);
    }

}
