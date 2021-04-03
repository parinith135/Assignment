/*14. Implement a JAVA program to find the Mean of given 5 numbers.*/
class MeanNumbers{
	public static void main(String args[]){
		int arr[]={ 12,56,32,24,44 };
		int i;
		float mean,sum=0;
		for(i=0;i<5;i++){
			sum += arr[i];
		}
		mean = sum/5;
		System.out.println("Mean of given 5 numbers is "+ mean);
	}
}