/*43. Implement a java program to print 1 to 100 without using numbers in the program.*/
class PrintNumbers{
    public static void main(String args[]) {
		int one = 'A'/'A';
		String S = "..........";
		
		for(int i=one; i<=(S.length() * S.length());i++){
			System.out.println(i);
		}
	}
}