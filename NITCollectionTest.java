class NITCollectionTest 
{
	public static void main(String[] args) 
	{
		
		NITCollection col=new NITCollection();
			System.out.println("Capacity:"+col.capacity());
		    System.out.println("size:"+col.size());
			System.out.println("else:"+col);
					
			col.add("a");
			col.add(5);
			col.add(6.7);
			col.add("a");
			col.add("9");
			col.add("c");
			col.add("r");
			col.add("s");
			col.add("2");
			col.add("6");
			
            System.out.println("Capacity:"+col.capacity());
		    System.out.println("size:"+col.size());
			System.out.println("else:"+col);
			col.add("b");
		    System.out.println("Capacity:"+col.capacity());
	        System.out.println("size:"+col.size());
		    System.out.println("else:"+col);

	       System.out.println("-----------------------------");
		   System.out.println("element available::"+col.contains(55));
		   System.out.println("Index of the element::"+col.indexOf(5));
		   System.out.println("Index of the element from location::"+col.indexOf("2",5));
		   System.out.println("LastIndex of the collection element::"+col.lastIndexOf("r"));
		   System.out.println("LastIndex of the collection element from location::"+col.lastIndexOf("c",5));
			
			

			

	}
}
