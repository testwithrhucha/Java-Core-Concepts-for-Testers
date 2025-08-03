
public class WrapperClasses {

	
	
	public static void main(String[] args) {
		// primitive 
		
		int x=100;
		double d=23.45;
		char c='A';
		boolean b=true;
		
		
		// converting primitive into object types ------auto boxing 
		
		 Integer iobj=x;
		 Double dobj=d;
		 Character cobj='A';
		 Boolean bobj=true;
		 
		 System.out.println(iobj);
		 System.out.println(dobj);
		 
		 System.out.println(cobj);
		 System.out.println(bobj);
		 // converting object types into the primitive 
		 
		 int invalue=iobj;
		 double dvalue=dobj;
		 char cvalue=cobj;
		 boolean bvalue=bobj;
		 
		 System.out.println(invalue);
		 
		 System.out.println(dvalue);
		 
		 
		 System.out.println(bvalue);
		 
		 
		 System.out.println(cvalue);
		 
	
	}

}
