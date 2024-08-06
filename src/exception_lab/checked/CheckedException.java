package exception_lab.checked;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

    /**
     *
     * java.lang
     * Object -> Throwable -> Exception -> CheckedException들
     *                                  -> RuntimeException -> UncheckedException들
     *
     * 체크 : 컴파일러가 체크 해준다
     * 체크 예외는 복구 가능성이 있는 예외이므로 예외를 처리하는 코드를 catch로 잡거나 throws를 통해 메소드 밖으로 던질 수 있다
     * 예외를 처리하지 않으면 컴파일 에러가 발생한다.
     * 실제 개발에서는 언체크 예외를 사용한다.
     *
     * 체크 예외 예시 : IOException, SQLException
     */

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("somefile.txt"));
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            readFile("somefile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("이후 실행 가능");
    }

    public static void readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = reader.readLine();
        System.out.println(line);
        reader.close();
    }
}
