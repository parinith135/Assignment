/*38. Implement a Java program that reads a number in inches, converts it to meters(CLA)*/
class InchToMeters{
    public static void main(String args[]){
		double inch = Double.parseDouble(args[0]);
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }
}