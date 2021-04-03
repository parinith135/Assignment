/*26. Implement a Java program to check whether a number is a Duck Number or not*/
class DuckNumber{
	public static void main(String args[]){
		int num = 3210;
		int rem,c = 0;
		int temp = num;
		while(num != 0){
			rem = num%10;
			if(rem==0){
				System.out.println(temp+" is a Duck number");
				return;
			}
			else
				num /=10;
		}
			System.out.println(temp+" is not a Duck number");
	}
}