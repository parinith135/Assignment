/*41. Implement a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).*/
class SpeedCalculation{
	public static void main(String args[]){
		double distance = 100;
		int seconds = 30;
		int minutes = 25;
		int hours = 1;
		
		double totaltime = (double)( hours * 60 * 60)+( minutes * 60)+ seconds;
		double mps = distance/ totaltime;
		double kmph = ( distance/1000 ) / ( totaltime/3600 );
		double mph = kmph / 1.609;
		
		System.out.println("Total speed with respect to distance and time is "+ " mps= "+mps+" kmph= "+kmph+" mph= "+mph); 
	}
}