enum Pizza{
	SMALL(9), MEDIUM(12), LARGE(14), EXTRALARGE(17);
	private int size;
	Pizza(int size){
		this.size = size;
	}
	int getSize(){
		return this.size;
	} 
}

class EnumExample{
	public static void main(String[] args) {
		for(Pizza i: Pizza.values()){
			System.out.println(i+" Pizza is "+i.getSize()+" inches in diameter");
		}
	}
}