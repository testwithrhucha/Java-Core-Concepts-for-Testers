package com.MethodOverLoadingVsOverRiding_SuperKeyword_FinalKeyword;
class bank
	{
		double roi()
		{
			return 0;
		}
		
	}
	
	class RBI extends bank
	{
		double roi()
		{
			return 2.5;
			
		}
		
	}
	
	class ICIC extends bank
	
	{
		double roi()
		{
			return 5.2;
		}
	}
	
	
	

public class MethodOverriding_demo {
	

	public static void main(String[] args) {
		
		ICIC i=new ICIC();
		System.out.println(i.roi());
		
		RBI r=new RBI ();
		System.out.println(r.roi());

	}

}
