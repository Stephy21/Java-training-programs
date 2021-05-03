import java.util.Scanner;
class SumofCubesofDigits{
	public static void main(String[] args) {
		SumofCubesofDigits s = new SumofCubesofDigits();
		System.out.println("enter a number");
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		System.out.println("the sum of cubes of the digits of the number is "+s.Sum(val));
	}
	int Sum(int num){
		int rev;
		int sum=0;
		while(num!=0){
			rev = num %10;
			num = num/10;
			System.out.println(rev);
			sum +=Math.pow(rev,3);
		}
	return sum;
	}

}