/*36. Implement a Program in Java to check whether a number is a Keith Number or not*/
class KeithNumber{
   public static void main(String args[]){ 
     int i,num = 197; 
     int num1 = num;
	 int len = String.valueOf(num).length();
     int arr[] = new int[num]; 
     for(i=len-1; i>=0; i--)
     {
         arr[i] = num1 % 10;
         num1 /= 10;
          
     }      
     i=len;
	 int sum=0;
     while(sum < num)
     {
         sum = 0;
         for(int j=1; j<=len; j++)
         {
             sum += arr[i-j];
         }
         arr[i] = sum;
         i++;
     } 
     if(sum == num)
        System.out.println(num+" is a Keith Number");
     else
        System.out.println(num+" is not a Keith Number");
    }
}