package scanner_lab;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerClassMain {
    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);	// Scanner 객체 생성
//        public static final InputStream in = null;


        /**
         *
         *  ' ' 공백 '\n' 개행 '\t' 탭 기준 구분
         *
         * byte a = sc.nextByte(); 		// byte 형 입력 및 리턴
         *         short b = sc.nextShort(); 		// short 형 입력 및 리턴
         *         int c = sc.nextInt(); 			// int 형 입력 및 리턴
         *         long d = sc.nextLong(); 		// long 형 입력 및 리턴
         *         float e = sc.nextFloat(); 		// float 형 입력 및 리턴
         *         double f = sc.nextDouble(); 	// double 형 입력 및 리턴
         *         boolean g = sc.nextBoolean(); 	// boolean 형 입력 및 리턴
         *         String h = sc.next(); 			// String 형 입력 및 리턴 (공백을 기준으로 한 단어를 읽음)
         *         String i = sc.nextLine(); 		// String 형 입력 및 리턴 (개행을 기준으로 한 줄을 읽음)
         */

//        InputStream inputStream = System.in;
//        int a = inputStream.read();
//        System.out.println(a); // 1 byte 만 읽음

        InputStream inputstream = System.in;


        //lab2
//        byte[] a = new byte[10];
//        inputstream.read(a);
//
//        for(byte val : a){
//            System.out.println(val);
//        }



        //lab3
        InputStream inputStream = System.in;
        InputStreamReader sr = new InputStreamReader(inputStream);

        int c = sr.read();

        System.out.println((char) c);
        System.out.println(c);

    }
}
