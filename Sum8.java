/*9. Implement a JAVA program to find the number between 0 - 1000 where the sum is 8.*/
class Sum8{
	public static void main(String args[]){
		System.out.println("The numbers between 0 to 1000 whose sum is equal to 8 are:");
		int i;
		int rem;
		for(i=0;i<=1000;i++)
		{
		    int sum = 0;
			int temp = i;
			while(temp!=0)
			{
				rem = temp%10;
				sum += rem;
				temp /= 10;
			}
			if(sum == 8)
				System.out.println(i);
		}
	}
}
			