
public class DataConversion {

	public static void main(String[] args) {


		//String ---------to int,double,boolean,char(not possible)
		// 1.String ------int  
		//String s="welocome"; can not possible
		
		
		String s1="12";
		String s2="56";
		
		int sum=Integer.parseInt(s1) + Integer.parseInt(s2);
		
		System.out.println(sum);
		
		
		// 2.String ------double 
	
				
				
				String s3="12.56";
				String s4="56.34";
				
				double add=Double.parseDouble(s3) + Double.parseDouble(s4);
				System.out.println(add);
				
				
			//3. string -------- boolean
				
				String s5="true";
				
				boolean b=Boolean.parseBoolean(s5);
				System.out.println(b);
		
				
			// 4. string --------------char
				// can not convert not possible 
				
				
				// int,double,boolean,char --------- String
				// int to string
				int x=100;
				String str=String.valueOf(x);
				System.out.println(x);
				
				//  double to string
				
				double db=45.678;
				String str1=String.valueOf(db);
				System.out.println(db);
				
				// boolean to string
				
				boolean b1=false;
				String str3=String.valueOf(b1);
				
				System.out.println(b1);
				
				// char  to string
				
				char ch ='C';
				
				String str4=String.valueOf(ch);
				System.out.println(ch);
				
				
				

	}

}
