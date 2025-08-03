package com.Encapsulation.java;

public class ThisKeyword {
	
	int x; // class variables 
	int y;
	
	
	void set_data(int x, int y) // local variables
	{
		this.x=x;       // when we use same name for class and local variables then for differentiate them we use this keyword with class variables
		this.y=y;
	}
	
	void display()
	{
		System.out.println(x+" "+y );
	}
	

	public static void main(String[] args) {
	
          ThisKeyword th=new ThisKeyword();
          th.set_data(10, 20);
          
          th.display();
          
          
          

	}

}
