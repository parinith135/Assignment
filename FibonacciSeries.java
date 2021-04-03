/*21. Implement Java program to check if a given number is Fibonacci number or not.*/
class FibonacciSeries{
	public static void main(String args[]){
		int num = 21;
        int t1 = 0;
        int t2 = 1;
        int t3 = 0;
        while (t3 < num)
        {
            t3 = t1 + t2;
            t1 = t2; 
            t2 = t3;;
        }
        if(t3 == num)
            System.out.println("Belongs to Fibonacci series");
		else
            System.out.println("Doesn't belongs to Fibonacci series");
	}
}