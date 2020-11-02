public class Train1{
	public static void main(String[] args){
		double dad = 177;
		double mom = 165;
		double son = (dad + mom)*1.08/2;
		double duaghter = (dad*0.923 + mom)/2;
		System.out.println("儿子身高预计为：" + son + "cm");
		System.out.println("女儿身高预计为：" + duaghter + "cm");
	}
}