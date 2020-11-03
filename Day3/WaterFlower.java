public class WaterFlower{
	public static void main(String[] args){
		int count=0;
		for (int i = 100;i<=999;i++){
			int b = (i/100)*(i/100)*(i/100)+(i/10%10)*(i/10%10)*(i/10%10)+(i%10)*(i%10)*(i%10);
			if (b == i){
				System.out.print(i+" ");
				count++;
				if(count%2 == 0){
				System.out.println();
				}
			}
		}
	}
}