package Day8_train;

public class ArrayString {
    public static String arrString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        if (arr == null) {
            return null;
        }
        if (arr.length == 0) {
            return "[]";
        } else {
            sb.append("[");
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    sb.append(arr[i] + "]");
                } else {
                    sb.append(arr[i] + ",");
                }
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        int[] arr0 = null;
        int[] arr1 = new int[0];
        int[] arr2 = {1, 2, 3};
        System.out.println(arrString(arr0));
        System.out.println(arrString(arr1));
        System.out.println(arrString(arr2));
    }
}
