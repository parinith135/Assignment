/*35. Implement a Java program to print the first 15 numbers of the Pell series.*/
class PellNumbers{
    public static void main(String args[]){
	int num,t1=1,t2=0,nexterm;
    System.out.println("The first 15 Pell numbers are");
    for(num=1; num<=15; num++){
      nexterm = t1 + 2*t2;
      System.out.println(nexterm+" ");
      t1 = t2;
      t2 = nexterm;
     }
   }
 }
