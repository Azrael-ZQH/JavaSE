public class Practice1{
	public static void main(String[] args){
		int sum0 = 0;
		int sum1 = 0;
		for (int i=0;i<=100;i++){
			sum0+=i;
			if (i%2==0){
				sum1+=i;
			}
		}
		System.out.println("整数和为"+sum0);
		System.out.println("偶数和为"+sum1);
	}
}