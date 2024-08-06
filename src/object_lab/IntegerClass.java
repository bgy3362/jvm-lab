package object_lab;

public class IntegerClass {
    /**
     *
     자바에서 int와 Integer는 둘 다 정수를 나타내지만, 그 사용 목적과 특성에는 중요한 차이점이 있습니다. 이 차이점은 주로 자바의 기본형(primitive type)과 참조형(reference type)의 차이에서 비롯됩니다.

     int (Primitive Type)
     기본형 데이터 타입: int는 자바의 기본형 데이터 타입 중 하나입니다. 기본형 타입은 값을 직접 저장합니다.
     메모리 사용: 기본형 데이터 타입은 스택 메모리에 직접 저장되며, 메모리 효율이 좋습니다.
     기본값: int의 기본값은 0입니다.
     연산: int 타입은 산술 연산 등 기본 연산이 매우 빠릅니다.
     null 불가능: 기본형 타입은 null 값을 가질 수 없습니다.

     Integer (Reference Type)
     참조형 데이터 타입: Integer는 자바의 참조형 데이터 타입으로, java.lang.Integer 클래스의 인스턴스를 나타냅니다.
     객체: Integer는 객체로 힙 메모리에 저장됩니다.
     기본값: 참조형의 기본값은 null입니다. 따라서 Integer는 null 값을 가질 수 있습니다.
     기능: Integer 클래스는 정수를 객체로 다루기 위한 다양한 유틸리티 메서드를 제공합니다. 예를 들어, parseInt, valueOf, toString 등이 있습니다.
     사용 용도: Integer는 주로 제네릭 타입, 컬렉션 프레임워크와 같은 참조형이 필요한 곳에서 사용됩니다.

     메모리: int는 값이 스택에 직접 저장되는 반면, Integer는 객체로 힙 메모리에 저장되며 참조를 통해 접근됩니다.
     기본값: int는 null을 가질 수 없지만, Integer는 null을 가질 수 있습니다.
     기능성: Integer는 많은 유틸리티 메서드를 제공하는 반면, int는 단순히 값을 저장하고 기본 연산만을 수행합니다.
     사용 용도: 기본형 타입이 필요한 경우 int를 사용하고, 객체가 필요한 경우나 컬렉션, 제네릭과 함께 사용할 때는 Integer를 사용합니다.

     오토박싱과 언박싱
     자바 5부터는 오토박싱과 언박싱이 도입되어, 기본형과 참조형 간의 변환이 자동으로 이루어집니다.

     오토박싱: 기본형 타입을 자동으로 참조형 타입으로 변환.
     언박싱: 참조형 타입을 자동으로 기본형 타입으로 변환.
     */

    public static void main(String[] args) {
        String s = Integer.toString(123);
        int a = Integer.parseInt("123");
    }
}
