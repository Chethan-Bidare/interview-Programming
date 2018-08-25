package programming;

public class CheckIfStringContainsOnlyDigits {

	public void getResult(String str){
		int length = str.length();
		if(str.matches("[0-9]{"+length+"}")){
			System.out.println("String contains only digits");
		}
		else{
			System.out.println("String does not contains only digits");
		}
	}
	
	public static void main(String[] args){
		CheckIfStringContainsOnlyDigits sd = new CheckIfStringContainsOnlyDigits();
		String str = "12345678mnb";
		sd.getResult(str);
	}
}
