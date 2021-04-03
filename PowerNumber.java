/*18. Find the power of the number without using existing methods. */
class PowerNumber{
	public static void main(String args[]){
		int num = 5;
		int power = 3;
		int i,result = 1;
	for(i=0;i<power;i++)
	{
		result *= num;
	}
    	System.out.println(" Result of "+ num +" ^ "+ power +" is "+ result);
    }
}