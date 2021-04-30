package Stephy;
class House{
	public static void main(String[] args) {
		System.out.println("inside house");
		Bedroom b=new Bedroom();
		b.sleep();
	}
}
class Bedroom{
	private String bed;
	protected void sleep(){
		System.out.println("Sleeping");
		bed="bed is private can only be accessed from bedroom class";
		System.out.println(bed);

	}
}
public class LivingRoom{
	String sofa;
	protected void Sit(){
		System.out.println("Sitting");
	}
}
