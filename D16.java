//programme:47 showing the MOVR and this contain the current object ref

  class A16 {
	void m1(){
		System.out.println("A M1");
	}

     void m2(){
		System.out.println("A M2");
	}
}

 class B16 extends A16{
    
	void m1(){
        System.out.println("B M1");
	}
    
	void m3(){
		System.out.println("B M3");
		m1();
		super.m2();

	}
}

class C16 extends B16{
	
	void m2(){

		System.out.println("C m2");
	//	m4();

	}
}

class D16 extends C16{

	void m1(){
		System.out.println("D m1");
	}

	void m2(){
		System.out.println("D m2");
	}

	void m4(){

		System.out.println("D m4");
	}
   public static void main(String[] args){

	   D16 d = new D16();

	   d.m1();
	   d.m2();
	   d.m3();
	   d.m4();
}
}