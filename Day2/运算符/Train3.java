public class Train3{
	public static void main(String[] args){
		int rose = 24;
		int peanut = 8;
		int rice = 3;
		int three = rose+rice+peanut;
		double planA = three>30?three*0.8:three;
		double planB = three - 8;
		double result = planA>planB?planB:planA;
		System.out.println("最少花费"+result+"元");
	}
}