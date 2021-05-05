import java.util.Scanner;
class UsernameValidation{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a username ending with _job and a minimum of 8 characters before the underscore:");
		String username = scan.nextLine();
		UsernameValidation uv = new UsernameValidation();
		boolean check = uv.check(username);
		System.out.println(check);


	}
	boolean check(String username){
		int flag = 0;
		if(username.endsWith("_job") && username.lastIndexOf("_job")>8){
			flag = 1;
		}
		if(flag==1){
			return true;
		}
		else{
			return false;
		}
	}
}