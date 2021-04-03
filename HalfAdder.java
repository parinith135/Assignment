/*10. Implement a JAVA program to implement a Half adder using Bitwise operator. */
class HalfAdder{
    static void Add(int a, int b)
    {
        int sum = a ^ b;
		int carry = a & b;
		System.out.println("Sum is "+ sum);
		System.out.println("Carry is "+ carry);
    }
	public static void main(String args[]){
		int x = 1;
		int y = 1;
		Add(x,y);
	}
		
	
}