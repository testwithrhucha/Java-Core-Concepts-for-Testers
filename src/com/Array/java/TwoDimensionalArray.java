package com.Array.java;

public class TwoDimensionalArray {

	public static void main(String[] args) {
	
		//Declaring 2D Array
		
		int a[][]=new int[3][2];
		// add value in 2D array
		
		a[0][0]=23;
		a[0][1]=45;
		
		a[1][0]=89;
		a[1][1]=94;
		
		a[2][0]=69;
		a[2][1]=99;
		
		
		// Retrieve single value from array
		System.out.println(a[0][0]);
		
		// Size of an array
		
		System.out.println(a.length);// rows 
		System.out.println(a[0].length);// columns 
		
		
		
		// Declaring + adding values
		
		int arr1[][]= { {23,45},
				{56,89},
				{78,29}
				};
		
		System.out.println(arr1[0][1]);
		
		//  Retrieving multiple value from an array 
		//1 using classic for loop
	    for (int i=0;i<=a.length-1;i++)
	    {
	    	for(int j=0;j<=a[i].length-1;j++)
	    	{
	    		System.out.print(a[i][j]+"  ");
	    	}
	    	System.out.println();
	    	
	    	
	    }
	    
	    // 2 using for each loop
	    
	    for(int arr[]:a)
	    {
	    	for(int x: arr)
	    	{
	    		System.out.print(x + " ");
	    	}
	    	System.out.println();
	    }
		

	}

}
