package exception_lab.unchecked;

public class UncheckedException {
    /**
     *
     * 언체크 예외 : NullPointerException, IllegalArgumentException
     */
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
