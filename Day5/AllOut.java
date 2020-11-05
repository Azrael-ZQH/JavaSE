package Day5;

public class AllOut {
    public static void out(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println();
        return;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99};
        out(arr);
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        out(arr1);
    }
}
