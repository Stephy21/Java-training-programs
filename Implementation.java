class Laptop{
	private String modelnum;
	private String serialnum;
	private String make;
		Laptop(String modelnum,String serialnum,String make){
			this.modelnum = modelnum;
			this.serialnum = serialnum;
			this.make = make;
		}
		public String getmodelnum(){
			return this.modelnum;

		}
		public String getserialnum(){
			return this.serialnum;

		}public String getmake(){
			return this.make;

		}
		public void setmodelnum(String modelnum){
			this.modelnum = modelnum;
		}
		public void setserialnum(String serialnum){
			this.serialnum = serialnum;
		}
		public void setmake(String make){
			this.make = make;
		}

	}
class Implementation{
	public static void main(String[] args) {
		Laptop lp1 = new Laptop("AW45009X","xxxx2300","Lenovo");
		Laptop lp2 = new Laptop("ZD56706C","xxxx4589","HP");
		System.out.println("Model number :"+(String)lp1.getmodelnum()+"Serial number"+(String)lp1.getserialnum()+"Make :"+(String)lp1.getmake());
		System.out.println("Model number :"+(String)lp2.getmodelnum()+"Serial number"+(String)lp2.getserialnum()+"Make :"+(String)lp2.getmake());
	}
}
