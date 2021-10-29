class Address {
	
	int flatno;
	String strname;
	String city;
	String state;
	int pincode;

Address(){
}

void setFlatno(int flatno){
	this.flatno=flatno;
}
void setStrname(String strname){
	this.strname=strname;
}

void setCity(String city){
	this.city=city;
}
void setState(String state){
	this.state=state;
}
void setPincode(int pincode){
	this.pincode=pincode;
}

int getFlatno(){
	return this.flatno;
}

String getStrname(){
	return this.strname;
}
String getCity(){
	return this.city;
}

String getState(){
	return this.state;
}

int getPincode(){
	return this.pincode;
}

void display(){
	System.out.println("flatno:\t"+this.flatno);
	System.out.println("streetno:\t"+this.strname);
	System.out.println("city:\t"+this.city);
	System.out.println("state:\t"+this.state);
	System.out.println("Pincode\t"+this.pincode);

}
}
