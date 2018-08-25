package programming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePAN {

	//method1
	public void validatePANnum(String str){
		
		/*char[] ch = str.toCharArray();*/
		
		Pattern pat = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		
		Matcher matcher = pat.matcher(str);
		
		if(matcher.matches()){
			System.out.println(" valid pan number");
		}
		else{
			System.out.println("Invalid ");
		}
	}
	
	//method2
	public void validatePANnum2(String str){
		
		if(str.length()==10){
			if(str.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")){
				System.out.println("valid");
			}
			else{
				System.out.println("invalid");
			}
		}
		else{
			System.out.println("Invalid");
		}
	}
	
	public static void main(String[] args){
		String str = "BYCPB7614NA" ;
		ValidatePAN pan = new ValidatePAN();
		pan.validatePANnum2(str);
	}
	
}
