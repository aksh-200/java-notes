import java.util.*;


class Menu{
	
	public static void table(int no1)
	{
		for(int i = 1;i<=10;i++)
		{
			System.out.println(no1*i);
		}
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int ans = table(a);
		System.out.println(ans);
	}
	
}