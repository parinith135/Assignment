/*28. Implement a Java program to check if a given number is circular prime or not.*/
class CircularPrime{
    public static void main(String[] args){
        boolean flag = true;
        int num =133;
		int rem, c = 0;
		int temp = num;
        while (num > 0)
        {
            rem = num % 10;
            c++;
            num /= 10;
        }
        for (int i = 1; i <= c; i++)
        {
            rem = temp % 10;
            temp /= 10;
            temp = (rem * (int) Math.pow(10, c - 1)) + temp;
			int x = 2;
        while (temp > x)
        {
            if (temp % 2 == 0)
            {
                flag = false;
                break;
            }
            x++;
        }
        }
        
        if(flag)
        {
            System.out.println("Circular Prime");
        }
        else
        {
            System.out.println("Not Circular Prime");
        }
	}
}
