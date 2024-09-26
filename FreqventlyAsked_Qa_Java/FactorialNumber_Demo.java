/* Factorial Number Is Number Which Is Calculates Below Numbers Acending Or Decending .
 * Example: 
 * 5! = 1* 2* 3* 4* 5=120     -------->    AccendingOrder
 * 5! = 5* 4* 3* 2* 1* = 120  ----------> DecendingOrder 
 */
package FreqventlyAsked_Qa_Java;

public class FactorialNumber_Demo {

	public static void main(String[] args) {

		int num=5;
		long factorial=1;
		
		for(int i=1; i<=num; i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial Number With Accending Order:"+factorial);
		
		
		int number=5;
		int Factorial=1;
		
		for(int x=number; x>=1; x--)
		{
			Factorial=Factorial * x;
		}
		System.out.println("Factorial Number With Decending Order:"+Factorial);
		

		
		
	}

}
