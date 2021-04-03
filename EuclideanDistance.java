/*17. Find the dictance between two points, using euclidean distance.*/
import java.lang.*;
class EuclideanDistance{
	public static void main(String args[]){
		int x1= 1;
		int y1 = 2;
		int x2 = 3;
		int y2 = 4;
		double diff = Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2);
		double distance = Math.sqrt(diff);
		System.out.println("Distance between the two points is: " + distance);
	}
}