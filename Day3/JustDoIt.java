public  class JustDoIt{
	public static void main(String[] args){
		int a = 0;
		do {
			a++;
			System.out.print("gogogo");
			if (a%2==0)
			{
				System.out.println("gogogo");
			}
			if (a == 10000){
				break;
			}
		}while(true);
	}
}