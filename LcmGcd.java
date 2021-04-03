/*7. Implement a JAVA program to find the GCF  and LCM of given numbers. */
class LcmGcd{
	public static void main(String args[]){
		int num1=36;
		int num2=18;
		int rem=0;
		int num,den,lcm,gcd;
	if(num1>num2)
    {  
		num = num1;
		den = num2;
	}
	else
	{
		num = num2;
		den = num1;
	}
		rem =num%den;
		while(rem!=0)
		{
			num = den;
			den = rem;
			rem = num%den;
		}
		
     gcd = den;
     lcm = (num1*num2)/gcd;
	
	 System.out.println("GCD of given two numbers is :" + gcd);
	 System.out.println("LCM of given two numbers is :" + lcm);
	}
}
	