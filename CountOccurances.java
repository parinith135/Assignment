/*44. Implement a java program to count the repeted occurance of a digit in a n-digit number.*/
class CountOccurances{
	public static void main(String args[]){
		int num = 1234284202;
		int count = 0;
		int digit = 2;
    while (num > 0) 
    {
  
        count = (num % 10 == digit) ? count + 1 : count;
        num /= 10;
    }
  
    System.out.println("Number of occurances of given digit is "+count);
   }
}