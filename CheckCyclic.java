/*30. Implement a Java program to check a number is a cyclic or not.*/
class CheckCyclic{
	public static void main(String args[]){
		int num = 142857;
		int temp = num,count = 0;
		int digit,i,j,k;
		int flag = 1;
		int len = String.valueOf(num).length();
		
		for( i = 0; i < len - 1 ; i++){
			flag = flag * 10;
		}

		for(j = 0; j < len; j++){
			digit = num % 10;
			num /= 10;
			num = (digit * flag) + num;
			
			for(k = 1; k <= len; k++)
			{
				if(num == (temp * k)){
					count++;
				}
			}
		}
		if(count == len){
			System.out.println("It is a cyclic number");
		}
		else{
			System.out.println("It is not a cyclic number");
		}
		
	}
}