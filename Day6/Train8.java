package Day6_train;

public class Train8 {
    public static void arrayReverse(int[] arr) {
        for (int f = 0, b = arr.length - 1; f < b; f++, b--) {
            arr[f] = arr[f] ^ arr[b];
            arr[b] = arr[f] ^ arr[b];
            arr[f] = arr[f] ^ arr[b];
        }
    }

    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        arrayReverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
