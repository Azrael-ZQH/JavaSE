package Day4;

import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {19, 28, 37, 46, 50};
        System.out.println("请输入一个数在数组内查找：");
        int a = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                System.out.println("数组中有这个数据");
                count++;
                System.out.println(i);
                break;
            }
        }
        if (count == 0) {
            System.out.println("数组中暂无该数据");
        }
    }
}
