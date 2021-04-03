/*23. Implement a Java program to check whether a number is a Harshad Number or not.*/
class HarshadNumber{  
    public static void main(String args[]) {  
        int num = 156;  
        int rem = 0;
        int sum = 0; 
        int temp = num;
		
        while(num != 0){  
            rem = num%10;  
            sum += rem;  
            num /= 10;  
        }  

        if(temp%sum == 0)  
            System.out.println(temp + " is a harshad number");  
        else  
            System.out.println(temp + " is not a harshad number");  
    }  
}  