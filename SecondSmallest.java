import java.util.Arrays;
import java.util.Scanner;
class SecondSmallest{
	public static void main(String[] args) {
		System.out.println("enter the number of elements : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] arr = new int[num];
		for(int i=0;i<num;i++){
			arr[i] = scan.nextInt();
		}
		SecondSmallest ss = new SecondSmallest();
		System.out.println("Second smallest in the array is :"+ss.getSecondSmallest(arr));
	}
	int getSecondSmallest(int... values){
		Arrays.sort(values);
		return values[1];
	}
}