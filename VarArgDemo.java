class VarArgDemo{
	public static void main(String[] args) {
		VarArgDemo ref=new VarArgDemo();

		System.out.println("Addition of numbers is :"+ ref.add(99));
		System.out.println("Addition of numbers is :"+ ref.add(67,6,99));
		System.out.println("Addition of numbers is :"+ ref.add(67,6));
		System.out.println("Addition of numbers is :"+ ref.add());
	}

	int add(int... values){
		int sum=0;
		for(int i=0;i<=values.length-1;i++)
		{
			sum+=values[i];
		}
		return sum;
	}
}