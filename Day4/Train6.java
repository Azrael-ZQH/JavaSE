package Day4_train;

import java.util.Scanner;

public class Train6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int root = sc.nextInt();
        int count = 0;
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        for (int i = 0; i < arr.length; i++) {
            if (root >= arr[i]) {
                count++;
            }
        }
        int[] arrr = new int[arr.length + 1];
        for (int i = 0; i < arrr.length; i++) {
            if (i == count) {
                arrr[i] = root;
            } else if (i > count) {
                arrr[i] = arr[i - 1];
            } else {
                arrr[i] = arr[i];
            }
            System.out.print(arrr[i] + " ");
        }
    }
}
