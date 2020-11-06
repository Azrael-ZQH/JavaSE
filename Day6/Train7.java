package Day6_train;

import java.util.Scanner;

public class Train7 {
    public static void arrayFind(int a, int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                sum++;
                System.out.println("与该数据相同的数组对应索引编号为：" + i);
            }
        }
        if (sum == 0) {
            System.out.println("该数组中无相同数据");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数，在数组中进行查找：");
        int[] arr = {19, 28, 37, 46, 50};
        arrayFind(sc.nextInt(), arr);
    }
}
