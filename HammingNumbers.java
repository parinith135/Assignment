/*37. Implement a Java program to create the first twenty Hamming numbers*/
class HammingNumbers{
	public static void main(String args[]){
		int num = 2;
		int temp = num;
		int count = 0;
		System.out.println("The first 20 Hamming numbers are");
		System.out.println(1);
		while(count < 19){
			temp = num;
			while(num % 2 == 0){
				num /= 2;
			}
			while(num % 3 == 0){
				num /= 3;
			}
			while(num % 5 == 0){
				num /= 5;
			}
			if( num == 1){
				System.out.println(temp);
				count++;
			}
			
			num = temp;
			num++;
		}			
	}
}