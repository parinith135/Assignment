/*33. Implement a program to check if a number is Mersenne number or not.*/
class MersenneNumber{
    public static void main(String args[]){
        int num = 31;
        int num1 = num + 1;
        int power = 0;
		int flag = 0;
        for(int i=0;;i++)
        {
            power=(int)Math.pow(2,i);
            if(power>num1)
            {
                break;
            }
            else if(power==num1)
            {
               System.out.println(num+" is a Mersenne number");
               flag = 1;
            }
        }
  if(flag==0)
  {
   System.out.println(num+" is not a Mersenne number");
  }
    }
}