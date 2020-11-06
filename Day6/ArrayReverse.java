package Day6;

public class ArrayReverse {
    public static void rev(int[] arr) {//用于数组反转功能
        for (int q = 0, m = arr.length - 1; q < m; q++, m--) {
            arr[q] = arr[q] ^ arr[m];//int temp = arr[q];
            arr[m] = arr[q] ^ arr[m];//arr[q]=arr[m];
            arr[q] = arr[q] ^ arr[m];//arr[m]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        rev(arr);
        for (int i = 0; i < arr.length; i++) {//打印输出验证结果
            System.out.print(arr[i] + " ");
        }
    }
}
