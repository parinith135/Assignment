/*40. Implement a Java program to compute body mass index (BMI).*/
class BodyMassIndex{
	public static void main(String args[]) {
      double weightkg = 50;
      double heightmeters = 1.5;
      double bmi = weightkg / ( heightmeters * heightmeters) ;
         System.out.println("Bodymassindex is "+ bmi);
      if(bmi < 18.5)
         System.out.println("Thin");
      else if(bmi < 25)
         System.out.println("Normal");
      else if(bmi < 30)
         System.out.println("Chubby");
      else
         System.out.println("Obese");
   }
}