/*45. Implement a java program to check whether there is any occurance of characters in a n-digit input number*/
class CountCharacter{
	public static void main(String args[]){
		int i;
		int flag = 1;
		char ch;
		String str = args[0];		
		for(i = 0; i < str.length() ; i++){
			ch = args[0].charAt(i);
			if(!((ch > '0') && (ch < '9'))){
				flag = 0;
				break;
			}
		}
		
		if(flag == 1){
			System.out.println("No character present");
		}
		else{
			System.out.println("Character is present");
		}
		
	}
}