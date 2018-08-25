package programming;

public class IsArmstrongOrNot {

	public boolean isArmstrongNumber(int number){
		
		int noOfDigits = String.valueOf(number).length();
		int sum = 0 ;
		int div = 0 ;
		while(number > 0){
			div = number % 10 ;
			int temp = 1 ;
			for(int i=0; i< noOfDigits ; i++){
				temp *=div ;
			}
			sum += temp ;
			number = number/10 ;
		}
		if(number==sum){
			return true ;
		}
		else{
			return false ;
		}
	}
}
