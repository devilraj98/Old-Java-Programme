class ThreadDemo{

	public static void main(String[] args){
		
		MyRunnable r = new MyRunnable();
		
		Thread t1= new Thread();
		Thread t2= new Thread(r);
		
		t1.start();        //case 1- new thread is created
	//	t1.run();         // case 2-
	//	t2.start();       // case 3-
	//	t2.run();         // case 4- a new thread not be created 
    //  r.start();        // case 5- CE:cannot find symbol
    //  r.run();         //  case 6-no new thread is created 


		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}

	}
	
}
