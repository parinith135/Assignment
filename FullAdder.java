/*11. Implement a JAVA program to implement a Full adder using Bitwise operator.*/
class FullAdder{
    static void Add(int a, int b, int c)
    {
        int sum = a ^ b ^ c;
		int carry = (a&b) | (b&c) | (c&a);
		System.out.println("Sum is "+ sum);
		System.out.println("Carry is "+ carry);
    }
	public static void main(String args[]){
		int x = 1;
		int y = 1;
		int z = 1;
		Add(x,y,z);
	}
		
	
}