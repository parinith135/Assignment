/*19. Implement a Java program to calculate the Binomial Coefficient of two positive numbers.*/
class BinomialCoefficient{
	static int bincoeff(int n, int k){
		if(k > n){
			return 0;
		}
		if(k == 0 || k == n){
			return 1;
		}
		return bincoeff(n - 1, k - 1) + bincoeff(n -1, k);
	}
	public static void main(String args[]){
		int n = 8, k = 2;
		System.out.println("Binomial Coefficient of "+ n +" and "+ k +" is "+bincoeff(n, k));	
	}
}