public class Mountain{
	public static void main(String[] args){
		double peak = 0.0001;
		int count = 0;
		while (peak <= 8844.43){
			peak*=2;
			count++;
		}
		System.out.println(peak);	
		System.out.println(count);	
	}
}