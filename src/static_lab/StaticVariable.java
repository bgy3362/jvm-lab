package static_lab;

class Number {
    static int num = 0;
    int num2 = 0;
}

public class StaticVariable {
    public static void main(String[] args) {
        Number number1 = new Number();
        Number number2 = new Number();

        number1.num++;
        number1.num2++;
        System.out.println(number2.num);
        System.out.println(number2.num2);

        // static 변수를 인스턴스끼리 공유하는 것 확인
        System.out.println("Number.num = " + Number.num);

    }
}

