/*8. Implement a JAVA program to find the odd numbers between 0-100.*/
class OddNumbers{
	public static void main(String args[]){
		int i;
		System.out.println("Odd numbers between 0-100 are: " );
		for(i=0;i<=100;i++)
		{
			if(i%2!=0)
				System.out.println(i);
		}
	}
}
				
				