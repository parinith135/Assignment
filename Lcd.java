/*50. Implement a java program to find the LCD of the given numbers.*/
class Lcd{
	public static void main(String args[]){
	    int num,den,rem,lcd,gcd;
        int num1 = 1;
		int den1 = 3;
		int num2 = 1;
		int den2 = 6;

  if(den1>den2)
  {  
    num = den1;
    den = den2;
  }
  else
  {
    num = den2;
    den = den1;
  }
  rem =num%den;
  while(rem!=0)
  {
    num = den;
    den = rem;
    rem = num%den;
  }
  
    gcd = den;
    lcd = (den1*den2)/gcd;

  System.out.println("LCD is "+lcd);
  System.out.println("GCD is "+gcd);
  
        num1 *= (lcd / den1);
        num2 *= (lcd / den2);
     
        int res = num1 + num2;
         
        System.out.println("Result is "+res + "/" + lcd);
  }
 }