class Result{
	public static void main(String[] args) {
		int sub1=Integer.parseInt(args[0]);
		int sub2=Integer.parseInt(args[1]);
		int sub3=Integer.parseInt(args[2]);
		int sum=sub1+sub2+sub3;
		int f=1;
		if(sub1<=40)
		{
			 f=0;
		}
		else if(sub2<=40)
		{
			f=0;
		}
		else if(sub3<=40)
		{
			f=0;
		}
		else if(sum<=125)
		{
			f=0;
		}
		if (f==0)
		{
			System.out.println("Student is failing");
		}
		else
		{
			System.out.println("Student is passing");
		}

	}
}