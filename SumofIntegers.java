import java.util.Scanner;
import java.util.StringTokenizer;
class SumofIntegers{
	public static void main(String[] args) {
		System.out.println("enter a line of integers :");
		Scanner scan = new Scanner(System.in);
		String st =scan.nextLine();
		StringTokenizer str = new StringTokenizer(st);
		int sum = 0;
		while(str.hasMoreTokens()){
			int integer = Integer.parseInt(str.nextToken());
			sum+=integer;
		}
		System.out.println(sum);
	}
}