package access_modifier_lab;

public class Example {
    //default 메서드
    void def() { }

    //protected 메서드
    protected void prot() {	}

    //private 메서드
    private void priv() { }

    //public 메서드
    public void pub() { }

    public static void main(String[] args) {
        Example example = new Example();
        example.def();
        example.prot();
        example.priv();
        example.prot();
    }
}

class Main {
    public static void main(String[] args) {
        Example example = new Example();
        example.def();
        example.prot();
//        example.priv();
        example.prot();
    }
}
