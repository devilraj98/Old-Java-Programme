

class COMPANY {
	
	public static void main(String[] args){
		Employee E1=new Employee(101,"neeraj",new String[]{"cs","it","bsc"},1000);
		E1.display();
		E1.setMob(9041515589L);
		E1.display();
		Laptop lap1=new Laptop();
		lap1.setBrand("HP");
		lap1.setOs("windows");
		lap1.setRAM(4);
		lap1.setHD(1);
		E1.setLaptop(lap1);
		E1.display();
	}

}
