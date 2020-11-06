package Day6_train;

public class Train6 {
    public static void arrayEva(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    System.out.println("数组中元素不同");
                    return;
                }
            }
            System.out.println("数组中元素相同");
            return;
        } else {
            System.out.println("数组长度不同，导致数组不相同");
            return;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {1,3,4};
        arrayEva(arr1, arr2);
    }
}
