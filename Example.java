class Example{

    static void m1(){
	System.out.println("Example m1");
        
		}

    void m2(){
		System.out.println("Example m2");
	}

	void m3(){
		System.out.println("Example m3");
	}

	void m4(){
		System.out.println("Example m4(no param)");
	}

}

class Sample extends Example{
      
	//  static void m1(){
	//	  System.out.println("Sample m1");
	 // }

      void m2(){
		System.out.println("Sample m2");
	}    

	  void m4(String s){
		System.out.println("Sample m4(int-param)");
	}

}
