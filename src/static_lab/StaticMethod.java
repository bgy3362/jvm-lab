package static_lab;

class Name {
    private static int a;
    static void print() {
        System.out.println(a);
    }

    void print2() {
        System.out.println("B");
    }
}

public class StaticMethod {

    public static void main(String[] args) { // 이것도 static method
        Name.print(); //인스턴스를 생성하지 않아도 호출이 가능

        Name name = new Name(); //인스턴스 생성
        name.print2(); //인스턴스를 생성하여야만 호출이 가능
    }
}


