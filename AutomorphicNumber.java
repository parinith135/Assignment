/*25. Implement a Java program check whether a number is an Automorphic number or not.*/
class AutomorphicNumber{
    public static void main(String args[]){
        int num = 5;
        int c = 0;
		int square = num*num;
        int temp =num;

        while(temp>0){
            c++;
            temp /= 10;
        }
 
        int squarepart = (int) (square%(Math.pow(10,c)));
 
        if(num == squarepart)
            System.out.println("Automorphic number");
        else
            System.out.println("Not an Automorphic number");
    }
}