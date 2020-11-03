public class PigYear{
	public static void main(String[] args){
	
		int pig = 0;
		for (int i = 2019;i>=1949;i--){
			if((2019-i) %12 == 0){
				System.out.print(i+"\t");
				pig++;
			}
		}
		System.out.println();
		System.out.println(pig);
	}
}
