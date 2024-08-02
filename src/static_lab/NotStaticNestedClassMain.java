package static_lab;

public class NotStaticNestedClassMain {
    public static void main(String[] args) {
          //StaticNestedClass 인스턴스를 만들지 않아서 오류 발생
//        NotStaticNestedClass.InnerClass innerClass = new NotStaticNestedClass.InnerClass();
//        innerClass.display();

        NotStaticNestedClass notStaticNestedClass = new NotStaticNestedClass();
        NotStaticNestedClass.InnerClass innerClass = notStaticNestedClass.new InnerClass(); // outer class 인스턴스를 통해 접근 가능
        innerClass.display();
    }
}
