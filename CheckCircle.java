/*47. Implement a java program to find whether a circle is inside another circle or not. (consider all the possibel cases)*/
class CheckCircle{
	public static void main(String args[]){
		int x1 = 1;
		int y1 = 2;
		int x2 = 3;
		int y2 = 4;
		int radius1 = 5;
		int radius2 = 7;
		double distance = Math.sqrt(Math.pow((x2 -x1), 2) + Math.pow((y2 - y1), 2));
		if((distance + radius2) > radius1){
			System.out.println("The circle is not present inside any other circle");
		}
		else{
			System.out.println("The circle is present inside of another circle");
		}
	}
}