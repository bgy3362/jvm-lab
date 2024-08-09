package thread_lab;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ThreadUtils {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss:SSS");

    public static void log(Object obj) {
        String time = LocalTime.now().format(formatter);
        System.out.printf("%s [%9s] %s\n", time, Thread.currentThread().getName(), obj);
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            log("인터럽트 발생, " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
