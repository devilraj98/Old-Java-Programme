class MHOVOR{
	static void m1(){
		System.out.println("A M1");
	}
	void m2(){
		System.out.println("A M2");
	}
	static void m3(){
		System.out.println(" A m3 no-para");
	}
	int m3(String s){
		System.out.println("A m3 string-param");
		return 50;

	}


}

class B12 extends MHOVOR{
	static void m1(){
		System.out.println("B m1");
	}

	void m2(){
		System.out.println("B m2");
	}

	void m3(float f,int x){
		System.out.println("B m3 float,int param");
	}
	

}