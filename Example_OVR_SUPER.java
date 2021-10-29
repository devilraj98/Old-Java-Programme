class Example_OVR_SUPER{

	void m1(){
	System.out.println("Example m1");
	}
	
	void m2(){
	System.out.println("Example m2");
	}

	void m3(){
	System.out.println("Example m3");
	}


}

class Sample extends Example_OVR_SUPER{

     void m1(){
		 System.out.println("Sample m1");
		 
		 }
        
		void m2(){
			super.m2();
			System.out.println("Sample m2");

		}
}