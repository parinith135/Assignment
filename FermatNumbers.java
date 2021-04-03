/*31. Implement a Java program to display first 10 Fermat numbers.*/
class FermatNumbers{
      public static void main( String args[] ){ 
        int i = 0;        
        double result;
        System.out.println("The first 10 Fermat numbers are ");
        for(i=0;i<10;i++){
            result= Math.pow(2, Math.pow(2, i)) + 1;
            System.out.println(result);
        }
     }  
}
