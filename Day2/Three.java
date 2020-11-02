public class Three{
	public static void main(String[] args){
		float a = 150f;
		float b = 165f;
		float c = 210f;
		float taller = b > c ? b:c;
		float tallest = (a>taller)?a:taller;
		System.out.println(tallest);
		float result = a > (b > c ? b:c) ? a:(b > c ? b:c);
		System.out.println(result);
		float nice = a > b ? (a > c ? a:c):(b > c ? b:c);
		System.out.println(nice);
	}	
}