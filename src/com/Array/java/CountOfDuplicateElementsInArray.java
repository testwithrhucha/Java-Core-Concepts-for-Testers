package com.Array.java;

public class CountOfDuplicateElementsInArray {

	public static void main(String[] args) {
	
	int arr[]= {84,38,20,39,20,69,20};
	int num=20;
	int count=0;
	
	
	for(int i=0;i<7;i++)
	{
		if(arr[i]==num)
		{
			count++;
			
		}
	}
	System.out.println("Count of duplicate element:" +count);
	
	
	// Count number of odd and even numbers in array
	
	int a[]= {56,9,35,90,39,50,19,30};
	
	int even=0;
	int odd=0;
	
	for(int value:a)
	{
		if(value%2==0)
		{
			even++;
		}
		
		else
		{
			odd++;
		}
	}
	
	System.out.println("Number of even elements :"+even);
	System.out.println("Number of odd elements:"+odd);
}
}
