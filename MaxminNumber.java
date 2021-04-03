/*13. Implement a JAVA program to find the max and min of given two numbers.*/
class MaxminNumber{
	public static void main(String args[]){
		int num1 = 84;
		int num2 = 42;
		int max,min;
		if(num1 > num2)
		{
			max = num1;
			min = num2;
			System.out.println("Max is "+ max +" and Min is "+ min);
		}
		else
		{
			max = num2;
			min = num1;
			System.out.println("Max is "+ max +" and Min is "+ min);
		}
	}
}