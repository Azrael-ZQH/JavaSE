package Day4;

public class Class {
    public static void main(String[] args) {
        int[]arr = {59,88,75,90,60,95,70,55};
        int sum=0,not = 0;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]<60){
                not ++;
            }
            sum +=arr[i];
        }
        System.out.println("不及格人数为"+not);
        System.out.println("平均分为"+sum/arr.length);
    }
}
