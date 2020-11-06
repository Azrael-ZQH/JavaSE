package Day6;

public class ArraySum {
    public static void sum(int[][] arr) {//遍历二维数组后累加
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {// int[] temp = arr[i];
            for (int j = 0; j < arr[i].length; j++) {//System.out.print(temp[j]); 遍历
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] arr = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99, 100}};
        sum(arr);
    }
}
