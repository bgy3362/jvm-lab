package data_structure_lab;

import java.util.Arrays;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        // List<Integer> 선언 및 초기화
        List<Integer> answer = Arrays.asList(1, 2, 3, 4, 5);

        // List<Integer>를 int[]로 변환
        int[] intArray = answer.stream().mapToInt(integer -> integer).toArray();
        // 결과 출력
        System.out.println(Arrays.toString(intArray));  // [1, 2, 3, 4, 5]
    }
}
