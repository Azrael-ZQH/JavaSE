package Day8_train;

import java.util.Scanner;

public class WorkTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Worker w = new Worker();
        System.out.println("请输入工人姓名：");
        w.setName(sc.nextLine());
        System.out.println("请输入工人工龄");
        w.setYear(sc.nextInt());
        System.out.println("该工人信息如下：");
        System.out.println("姓名：" + w.getName());
        System.out.println("工龄：" + w.getYear());
    }
}
