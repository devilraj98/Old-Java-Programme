 //programme 45:method overriding
 
 class testOVR {
 public static void main(String[] args){

	  Sample s= new Sample();

	  s.m1();          //compile time polymorfism
	  s.m2();		  //CP
	  s.m3();		 //CP
	  s.m4();		//CP
      s.m4("NK");  //CP
	  

	  Example e =new Sample();

	  e.m1();          //CP
	  e.m2();		  //run-time polymorfism
	  e.m3();		 //CP
	  e.m4();		//CP
  //  e.m4("NK");  ERROR
	 
      
	  }

}
