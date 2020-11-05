package Day5_train;

import java.util.Scanner;

public class Train7 {
    public static int magic(double a) {//四舍五入不考虑负值
        if (a < 0) {
            System.out.println("您输入值有误,系统报错结果");
            return 0;
        }
        if (a * 10 % 10 < 5) {
            int num = (int) a;
            return num;
        } else {
            int num = (int) (a + 1);
            return num;
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入一个小数进行四舍五入");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("四舍五入结果如下：" + magic(a));
    }
}
