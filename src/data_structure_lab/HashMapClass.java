package data_structure_lab;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        // HashMap 선언
        Map<String, Integer> map = new HashMap<>();

        // 요소 추가 
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        // 출력
        System.out.println(map);  // {apple=1, banana=2, orange=3}

        // 특정 키의 값 가져오기
        int appleCount = map.get("apple");
        System.out.println("Apple count: " + appleCount);  // Apple count: 1

        // 존재하지 않는 키에 접근 시
        Integer grapeCount = map.get("grape");
        System.out.println("Grape count: " + grapeCount);  // Grape count: null

        // 키 존재 여부 확인
        boolean hasBanana = map.containsKey("banana");
        System.out.println("Contains banana? " + hasBanana);  // Contains banana? true

        // 값 존재 여부 확인
        boolean hasCountTwo = map.containsValue(2);
        System.out.println("Contains value 2? " + hasCountTwo);  // Contains value 2? true

        // 특정 키의 요소 제거
        map.remove("banana");
        System.out.println(map);  // {apple=1, orange=3}

        // 모든 요소 제거
        map.clear();
        System.out.println(map);  // {}

        // 맵 크기 확인
        int size = map.size();
        System.out.println("Map size: " + size);  // Map size: 0

        // 맵이 비어있는지 확인
        boolean isEmpty = map.isEmpty();
        System.out.println("Is map empty? " + isEmpty);  // Is map empty? true

        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        // 키를 통한 순회
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // 값만을 통한 순회
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }

        // 키-값 쌍을 통한 순회
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
