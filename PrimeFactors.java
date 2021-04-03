/*20. Implemen a Java program to print all prime factors of a given number.*/
class PrimeFactors{
	public static void main(String args[]){
		int num = 24;
        for(int i = 2; i< num; i++){
			while(num%i == 0) {
				System.out.println(i+" ");
				num /= i;
         }
      }
      if(num >2) {
         System.out.println(num);
      }
	}
}