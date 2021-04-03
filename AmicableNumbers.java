/*27. Implement a Java program to check two numbers are Amicable numbers or not.*/
class AmicableNumbers{
	public static void main(String args[]){
		int num1 = 6;
		int num2 = 28;
		int sum1 = 0, sum2 = 0;
		for(int i = 1; i < num1; i++)
		{
			if(num1 % i == 0)
				sum1 += i;
		}
		for(int j = 1; j < num2; j++)
		{
			if(num2 % j == 0)
					sum2 += j;
		}
		if(sum1 == num1 && sum2 == num2)
			System.out.println("Given numbers are AmicableNumbers");
		else
			System.out.println("Given numbers are not AmicableNumbers");
	}	
}