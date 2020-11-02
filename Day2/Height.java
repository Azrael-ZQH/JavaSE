import java.util.Scanner;
public class Height{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个需要比较的身高值");
		float height1 = sc.nextFloat();
		System.out.println("请输入第二个需要比较的身高值");
		float height2 = sc.nextFloat();
		System.out.println("请输入第三个需要比较的身高值");
		float height3 = sc.nextFloat();
		float tallest = height1>height2?(height1>height3?height1:height3):(height2>height3?height2:height3);
		System.out.println("最高身高为："+tallest);
	}
}