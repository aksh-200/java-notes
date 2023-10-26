import java.util.*;

class TextCal{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no 1");
		int no1 = sc.nextInt();
		System.out.println("Enter no 2");
		float no2 = sc.nextFloat();
		float sum = NumService.addition(no1,no2);
		System.out.println("Sum is" + sum);
		
	}
}