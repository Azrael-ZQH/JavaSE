package Day4_train;

public class Tarin5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("{ ");
        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length) {
                System.out.println("}");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
