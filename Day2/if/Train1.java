public class Train1{
	public static void main(String[] args){
		int newPhone = 7988;
		int oldPhone = 1500;
		double change = newPhone*0.8;
		double exchange = newPhone-oldPhone;
		if (change<exchange){
			System.out.println("需要以旧换新，其价格为"+change+"元");
		}
		else {
			System.out.println("不需要以旧换新，其价格为"+exchange+"元");
			}
	}
}