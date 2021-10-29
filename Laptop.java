package nkjavatest;

class Laptop {

	String Brand;
	String Os;
	int HD;
	int RAM;

	Laptop(){}



void setBrand(String Brand){
	this.Brand=Brand;
}
void setOs(String Os){
	this.Os=Os;
}
void setHD(int HD){
	this.HD=HD;
}
void setRAM(int RAM){
	this.RAM=RAM;
}

String getBrand(){
	return this.Brand;
}
String getOs(){
	return this.Os;
}
int getHD(){
	return this.HD;
}
int getRAM(){
	return this.RAM;
}

void display(){
	System.out.println("Brand:\t"+this.Brand);
	System.out.println("OS:\t"+this.Os);
	System.out.println("HD:\t"+this.HD);
	System.out.println("RAM:\t"+this.RAM);
}
}