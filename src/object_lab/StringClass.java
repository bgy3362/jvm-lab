package object_lab;

public class StringClass {

    // split
    public static void main(String[] args) {
        String[] strs = "a 3 d".split(" ");
//        System.out.println("strs = " + strs);

        for(String s: strs) {
            System.out.println("s = " + s);
        }

        String s1 = "example1";
        String s2 = "example2";
        for(int i=0; i<s1.length(); i++) {
            System.out.println("s1.charAt(i) = " + s1.charAt(i));
        }
        char[] arr = s1.toCharArray();
        System.out.println("arr = " + arr[0]);

        String[] strs2 = {"hello", "hi"};
        for(int i=0; i < strs2.length; i++) {

        }

        System.out.println("String.join(\"-\",s1,s2) = " + String.join("-",s1,s2));
    }
}
