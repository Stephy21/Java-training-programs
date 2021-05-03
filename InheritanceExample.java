class GrandMother{
	String eyes;
	void Sing(){
		System.out.println("Grandmother can sing");
	}

}
class Mother extends GrandMother{
	String nose;
	void dance(){
		System.out.println("Mother can dance");
	}
}
class Daughter extends Mother{
	void dance(){
		System.out.println("Daughter is a western dancer");
	}

}
class InheritanceExample{
	public static void main(String[] args) {
		Daughter d = new Daughter();
		d.Sing();
		d.dance();
	}
}