class ObjectWork{
	public static void main(String[] args) {
		Car alto=new Car();
		alto.display();
		alto.color="BLUE";
		alto.display();
		alto.mileage();
	}
}

class Car{
	String color="RED";
	
	int speed=100;
	
	int tankcap=26;
	
	void display(){
		System.out.println(color);
	}
	
	void mileage()
	{
		int mile=100/tankcap;
		System.out.println(mile);
	}
}

