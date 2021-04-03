/*29. Implement a Java program to check a number is a cube or not.*/
class CheckCube{
	public static void main(String args[]){
        int num = 8;
		int cube;
		for (int i = 0; i <= num; i++){
            cube = i * i * i;
            if (cube == num) {
                System.out.println(num + " is a cube number ");
                return;
            }
            else if (cube > num) {
                System.out.println(num + " is not a cube number ");
                return;
            }
        }
 
    }
}