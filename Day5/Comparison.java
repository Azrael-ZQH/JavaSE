package Day5;

public class Comparison {
    public static boolean compare(byte a, byte b) {
        return a == b;
    }

    public static boolean compare(int a, int b) {
        return a == b;
    }

    public static boolean compare(short a, short b) {
        return a == b;
    }

    public static boolean compare(long a, long b) {
        return a == b;
    }

    public static void main(String[] args) {
        byte a = 0;
        byte b = 0;
        short c = 1000;
        short d = 1001;
        int e = 10;
        int f = 20;
        long g = 9223372036854775807l;
        long h = 9223372036854775807l;
        System.out.println(compare(a, b));
        System.out.println(compare(c, d));
        System.out.println(compare(e, f));
        System.out.println(compare(g, h));
    }
}
