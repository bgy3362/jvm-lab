package access_modifier_lab;

public class AccessModifierMain {
//    default(기본값, 접근 제어자를 명시하지 않음) : 같은 패키지 내에서만 접근 가능.
//    private : 같은 클래스 내에서만 접근 가능.
//    protected : 같은 패키지 + 다른 패키지의 자식 클래스에서 접근 가능.
//    public : 접근 제한 없음.
    public static void main(String[] args) {
        Example example = new Example();
        example.def();
        example.prot();
//        example.priv();
        example.pub();
    }
}
