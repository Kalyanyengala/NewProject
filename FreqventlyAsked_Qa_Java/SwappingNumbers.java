package FreqventlyAsked_Qa_Java;

public class SwappingNumbers {

	public static void main(String[] args)
	{
		int a=100;
		int b=200;
		
		// Approach1 with help of third variable
		
	   int c=a;
		a=b;
		b=c;
		System.out.println("Sawpping Number A Becomes :"+a);
		System.out.println("Swapping Number B Becomes: "+b);
		
		//Approach 2 without help of third varible.
		
		a=a+b;    //100+200=300
		b=a-b;    // 300-200=100
		a=a-b;    // 300-100=200
		
		System.out.println("Sawpping Number A Becomes :"+a);
		System.out.println("Swapping Number B Becomes: "+b);
		
		//Approach 3 without third varible Here values are not in zero then only this will works.
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("Sawpping Number A Becomes :"+a);
		System.out.println("Swapping Number B Becomes: "+b);
		
		//Approach4 with help of ^.
		
		a=a^b;    // Bitwise Oparetors.
		b= a^b;
		a= a^b;
		System.out.println("Sawpping Number A Becomes :"+a);
		System.out.println("Swapping Number B Becomes: "+b);
		
		// Approach 5 
		
		int x=100;
		int y=200;
		
		y=x+y-(x=y);
		System.out.println("Sawpping Number X Becomes :"+x);
		System.out.println("Swapping Number Y Becomes: "+y);
		

	}

}
