public class NITCollection{

	private Object[] objArray=null;
	private int elementCount=0;
	public NITCollection(){
		objArray = new Object[10];
		elementCount =0;
	}
	
	public void add(Object obj){
		
		if (size()==capacity()){
           increaseCapacity();
		}

		this.objArray[elementCount++] = obj;
	}

		public void increaseCapacity(){
			Object[] nextArray= new Object[capacity()*2];

			for(int i=0;i<objArray.length;i++){
			   nextArray[i]=objArray[i];
		}

		objArray=nextArray;
}

	public int capacity(){
		return this.objArray.length;

}

     public int size(){

	     return this.elementCount;
}

     public boolean contains(Object obj){
		 return (this.indexOf(obj)!=-1);

	 }
	  
	  public int indexOf(Object obj){
		  return indexOf(obj,0);
	  }


     public int indexOf(Object obj,int from){
		 Object[] objArray =this.objArray;
		 for(int i=from;i<size();i++){
			 if(obj.equals(objArray[i])){
				 return i;
			 }
		 }
		 return -1;
	 }

	    public int lastIndexOf(Object obj){
			return lastIndexOf(obj,size()-1);

		}

		 public int lastIndexOf(Object obj,int from){
			 Object[] objArray =this.objArray;
			  for(int i=from;i>=0;i--){
				  if(obj.equals(objArray[i])){
				  return i;
			  }
		 }
            return -1;
		 }

@Override

	public String toString(){

		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<size();i++){
			sb.append(objArray[i]);
			sb.append(",");
		}
		int start=sb.lastIndexOf(",");
		if(start!=-1){
			int end=start+2;
			sb.delete(start,end);
		}
		sb.append("]");
		return sb.toString();


  }

}