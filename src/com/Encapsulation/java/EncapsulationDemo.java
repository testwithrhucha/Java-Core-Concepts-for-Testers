package com.Encapsulation.java;

class encapsulation
{
	
	private int x;
	private int y; // we make variable private for make privacy so no object can be use this
	private int z;
	
	

	public int getZ() {     //get method () for  retrieving  data 
		return z;
	}



	public void setZ(int z) { // set method for setting the data 
		this.z = z;
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}


}

public class EncapsulationDemo {
	
	

	public static void main(String[] args) {
		encapsulation e=new encapsulation();
	e.setX(45);
	System.out.println(e.getX());
	e.setY(56);
	System.out.println(e.getY());
	e.setZ(67);
	System.out.println(e.getZ());
	

	}

}
