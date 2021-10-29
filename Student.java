class Student{

	int sno;
	String sname;
	String[] course;
	double fee;
	String email;
	long mob;
	long altMob;
	Address addr;



//we initalize at the time of object creation so we use constructor;

Student(int sno,String sname,String[] course, double fee){

	this.sno=sno;
	this.sname=sname;
	this.course=course;
	this.fee= fee;
}

//
void setEmail(String email){
	this.email=email;
}

void setMob(long mob){

	this.mob=mob;
}
void  setAltMob(long altMob){
	this.altMob=altMob;

}

void setAddress(Address addr){
	this.addr=addr;
}

void setSno(int sno){
	this.sno=sno;
}
int getSno(){
	return this.sno;
}
String getEmail(){
	return this.email;

}
long getMob(){
	return this.mob;
}
long getAltMob(){
	return this.altMob;
}

Address getAddress(){
	return this.addr;
}

void display(){
	System.out.println("Personal Details:::");
	System.out.println("sno:\t"+this.sno);
	System.out.println("sname:\t"+this.sname);
	System.out.println("course:\t"+java.util.Arrays.toString(this.course));
	System.out.println("fee:\t"+this.fee);
	System.out.println("email:\t"+this.email);
	System.out.println("mobno:\t"+this.mob);
	System.out.println("altmob:\t"+this.altMob);
	System.out.println("Address::\t");
if(addr==null){
		System.out.println("Address are not given");
	}
	else{
	this.addr.display();
	}
}
}

