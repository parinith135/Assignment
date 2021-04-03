/*22. Check whether the number is a palindrome number or not.*/
class PalindromeNumber{
	public static void main(String args[]){
		int num = 21122;
		int rem = 0;
		int reverse = 0;
		int temp = num;
		while(temp!=0){
			rem = temp % 10;
			reverse = reverse * 10 + rem;
			temp /= 10;
		}
		if(reverse == num)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome Number");
	}
}
			
	