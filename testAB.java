
class testAB{
	public static void main(String[] args){
    
	B12 b =new B12();
	
	b.m1();
	b.m2();
	b.m3();
	b.m3("abc");
 // b.m3(45.3,67);   ce:loosy conversion   
    b.m3(45.3f,34); 
	  
      

    MHOVOR a =new B12();

	a.m1();
	a.m2();
	a.m3();
	a.m3("abc");
//	a.m3(45.3f,43);     CE:no such method found 

    }
  

}