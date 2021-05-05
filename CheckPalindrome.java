import java.util.Scanner;
class CheckPalindrome{
	public static void main(String[] args) {
		System.out.println("enter a string : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int len = str.length();
		String rev ="";
		for(int i = len-1;i>=0; --i){
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev)){
			System.out.println("Palindrome");
		}
		else
			System.out.println("not a Palindrome");
	}
}