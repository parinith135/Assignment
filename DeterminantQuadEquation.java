/*16. Find the determinant, for the quadratic equations. */
import java.lang.*;
class DeterminantQuadEquation{
   public static void main(String args[]){
      double firstroot = 0;
	  double secondroot = 0;
      double a = 10;
	  double b = 25;
	  double c = 5;
      double determinant = (b*b)-(4*a*c);
      double root = Math.sqrt(determinant);

      if(determinant>0){
         firstroot = (-b + root)/(2*a);
         secondroot = (-b - root)/(2*a);
         System.out.println("The roots are "+ firstroot +" and "+secondroot);
      }else if(determinant == 0){
         System.out.println("The root is "+(-b + root)/(2*a));
      }
   }
}