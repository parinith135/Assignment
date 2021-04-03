/*3. Implement a JAVA program to print the ASCII values of A-Z, a-z , 0-9.*/
class AsciiValues{
	public static void main(String[] args)   
	{ 
		for(char i = '0'; i <= '9'; i++)  
		{  
			System.out.println("ASCII value of " + i + " is: " + (int)i);  
		}

		for(char i = 'A'; i <= 'Z'; i++)  
		{  
			System.out.println("ASCII value of " + i + " is: " + (int)i);  
		} 
 
		for(char i = 'a'; i <= 'z'; i++)  
		{  
			System.out.println("ASCII value of " + i + " is: " + (int)i);  
		}
 
	}  
}  