public class Train2{
	public static void main(String[] args){
		int red = 21;
		int green = 24;
		red = red*2 + 3;
		green *= 2;
		boolean yof = red == green;
		System.out.println("红茶妹妹现有rmb"+red+"元");
		System.out.println("绿茶妹妹现有rmb"+green+"元");
		System.out.println("红茶妹妹的钱和绿茶妹妹的钱一样多吗？"+yof);
	}
}