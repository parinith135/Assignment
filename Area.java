/*46. Implement a java program to find the area of a) Circle b) Rectangle c) Square d) trapezoid e)rhombus f) triangle*/
class Area{
	public static void main(String args[]){
	    double circle,radius = 10;
		circle = radius*radius*Math.PI;
		System.out.println("Area of Circle is "+ circle);
	
		double triangle,triheight = 5,tribase = 2;
		triangle = 0.5 * triheight * tribase;
		System.out.println("Area of triangle is "+ triangle);
	
	    double square, side = 5;
		square = side*side;
		System.out.println("Area of square is "+ square);
	
	    double rectangle, length =3,breadth =4;
		rectangle = length*breadth;
		System.out.println("Area of rectangle is "+ rectangle);
	
	    double rhombus, rhombase =4, rhomheight =7;
		rhombus = rhombase * rhomheight;
		System.out.println("Area of rhombus is "+ rhombus);
	
	    double trapezoid, base1 =2, base2 = 3, trapheight = 6;
		trapezoid = ((base1 + base2)/2)*trapheight;
		System.out.println("Area of trapezoid is "+ trapezoid);
	}
}