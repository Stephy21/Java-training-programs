import java.util.Scanner;
class Factorial{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=scan.nextInt();
		int fact=1;
		for(int i=num;i>0;i--)
		{
			fact*=i;
		}
		System.out.println(fact);
}
}