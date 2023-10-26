import java.util.* ;

class TestCalculate {
	
	public static void main(String [] args)
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter no 1");
		 int no1 =  sc.nextInt();
		  System.out.println("enter no 2");
		 int no2 =  sc.nextInt();
	     int ans = NumberService.addition(no1,no2);
		 System.out.println("answer is "+ ans);
	}
}