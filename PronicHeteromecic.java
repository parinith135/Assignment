/*24. Implement a Java program to check whether a number is a Pronic Number or Heteromecic Number or not.*/
class PronicHeteromecic{
    public static void main(String args[]){
        int num = 72;
        int flag=0;
        for(int i=1; i<num ; i++)
        {
            if(i*(i+1)==num)
            {
                flag=1;
                break;
            }
        }
        
        if(flag==1)
            System.out.println(num + " is a pronic number");
        else
            System.out.println(num + " is not a pronic number");
    }
}