package com.Array.java;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		
		int arr[]= {45,62,56,94,24,29,38};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to be search:");
		int search_item=sc.nextInt();
		
		
		boolean status=false;
		for(int i=0;i<7;i++)
		{
			if(search_item==arr[i])
			{
				System.out.println("Item found in array");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("Item not found in array");
		}
		

	}

}
