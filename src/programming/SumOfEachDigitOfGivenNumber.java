package programming;

public class SumOfEachDigitOfGivenNumber {

	int sum = 0 ;
	
	public int sumOfDigits(int number){
		
		
		if(number == 0){
			return sum ;
		}
		else{
			sum = sum + (number%10) ;
			number = number/10 ;
			sumOfDigits(number);
		}
		
		return sum ;
	}
	
	public static void main(String[] args){
		SumOfEachDigitOfGivenNumber obj = new SumOfEachDigitOfGivenNumber();
		System.out.println(obj.sumOfDigits(374));
	}
}
