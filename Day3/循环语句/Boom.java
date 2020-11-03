public class Boom{
	public static void main(String[] args){
		for (int h =1;h<=9;h++){
			for (int l=1;l<=h;l++){
				System.out.print(l+"*"+h+"="+(h*l)+"\t");
			}
			System.out.println();
		}
	}
}