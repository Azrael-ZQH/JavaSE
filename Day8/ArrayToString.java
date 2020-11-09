package Day8;

public class ArrayToString {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        String s = sb.toString();
        System.out.println(s);
    }
}
