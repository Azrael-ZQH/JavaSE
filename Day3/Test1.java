public class Test1{
	public static void main(String[] args){
		
		for (int i = 1;i<=5;++i){
			System.out.println(i);
		}
		System.out.println("-----------------------");
		for (int i=5;i>=1;i--){
			System.out.println(i);
		}
		System.out.println("-----------------------");
		int sum = 0;
		for (int i = 1;i<=5;i++){
			sum += i;
		}
		System.out.println(sum);
		System.out.println("-----------------------");
		sum = 0;
		for (int i = 1;i<=100;i++){
			if (i%2==0){ //奇数和改为 i%2 =1
				sum +=i;
			}
		}
		System.out.println(sum);
		
	}
}