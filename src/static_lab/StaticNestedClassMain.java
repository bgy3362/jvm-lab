package static_lab;

public class StaticNestedClassMain {
    public static void main(String[] args) {
        StaticNestedClass.InnerClass innerClass = new StaticNestedClass.InnerClass();
        innerClass.display(); // StaticNestedClass 인스턴스를 만들지 않아도 정상 작동
    }
}
