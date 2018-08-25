package programming;

public class ReverseANumber {

	public int getReverseNumber(int input){
		
		int reverse = 0;
		while(input!=0){
			reverse = (reverse * 10) + (input % 10) ;
			input = input / 10 ;
		}
		return reverse ;
	}
	
	public static void main(String[] args){
		
		int input = 897 ;
		ReverseANumber ra = new ReverseANumber();
		System.out.println("Reversed Number of "+input+" is : "+ra.getReverseNumber(input));
	}
}
