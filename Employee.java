package nkjavatest;

class Employee {
	int Eno;
	String Ename;
	String[] Dept;
	double Sal;
	long Mob;
	Laptop lap;

	Employee(int Eno,String Ename,String[] Dept){

		this.Eno=Eno;
		this.Ename=Ename;
		this.Dept=Dept;
		this.Sal=Sal;

}

void setMob(long Mob){
	this.Mob=Mob;
}
void setLaptop(Laptop lap){
	this.lap=lap;
}
void setEno(int Eno){
	this.Eno=Eno;
}
int getEno(){
	return this.Eno;
}
long getMob(){
	return this.Mob;
}

void display(){
	System.out.println("Employee details.......");
	System.out.println("Eno:\t"+this.Eno);
	System.out.println("Ename:\t"+this.Ename);
	System.out.println("dept:\t"+java.util.Arrays.toString(this.Dept));
	System.out.println("sal:\t"+this.Sal);
	System.out.println("MobileNo:\t"+this.Mob);
	System.out.println("LAPTOP::\t");

	if(lap==null){
		System.out.println("laptop is not provided");
	}
	else{
	     this.lap.display();
	}
}
}