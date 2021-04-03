/*48. Implement a java program to find the memory size in bytes given the input as address length.*/
class MemorySize{
	public static void main(String args[]){
		int startaddress = 414235;
		int endaddress = 414255;
		int size = (endaddress - startaddress)/8;
		System.out.println("The memory size in bytes is "+ size);
	}
}