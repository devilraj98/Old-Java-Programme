class College{
	
	public static void main(String[] args){

		Student s1=new Student(101,"raja",new String[]{"CoreJava","AJ","Oracle"},1000);
		//s1.display();
		s1.setEmail("raja@gmail.com");
		s1.setMob(88963665L);
		s1.setAltMob(123666996L);
		s1.display();
		Address addr1=new Address();
		addr1.setFlatno(1236);
		addr1.setStrname("ammerpet");
		addr1.setCity("hyd");
		addr1.setState("tg");
		addr1.setPincode(126595);
		s1.setAddress(addr1);
		s1.display();

	}
}