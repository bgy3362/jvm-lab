package exception_lab.error;

public class Error {
    /**
     *
     * Object -> Throwable -> Error
     *
     * OutOfMemoryError
     * StackOverflowError
     */

    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Stack Overflow Error occurred");
        }
        System.out.println("이후 실행 가능");
    }
    public static void recursiveMethod() {
        recursiveMethod(); // 무한 재귀 호출
    }
}
