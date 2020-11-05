package Day5;

public class MaxAndMinOut {
    public static int[] maxAndMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        int[] mAM = {max, min};
        return mAM;
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        int[] a = maxAndMin(arr);
        System.out.println("max" + "=" + a[0]);
        System.out.println("mix" + "=" + a[1]);
    }
}
