package Day5;

import java.util.Scanner;

public class Max {
    public static int max(int a, int b) {
       /* if (a >= b) {
            return a;
        } else return b;*/
       return (a>=b?a:b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一对需要比较数的大小");
        System.out.println("大的为"+max(sc.nextInt(), sc.nextInt())+"//仅仅打印输出调用");
        System.out.println("请输入第二对需要比较数的大小");
        int a = max(sc.nextInt(), sc.nextInt());
        System.out.println("大的为"+a+"//赋值调用，保存结果存入a中");
        System.out.println("单独调用：//这里毫无意义");
        max(sc.nextInt(),sc.nextInt());

    }
}
