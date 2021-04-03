/*1. Implement JAVA program to check whether a given number is ARMSTRONG or not. (3 digit)*/
class ArmStrong{
	public static void main(String args[]) {
		int num = 153;
		int sum=0,temp,digit;
		temp = num;
		
		while(num > 0) {
			digit = num % 10;
			sum += (digit * digit * digit);
			num = num / 10;
		}
		if(sum == temp) {
			System.out.println(temp+" is an Armstrong number\n");
		}
		else
			System.out.println(temp+" is not an Armstrong number\n");
	}
}