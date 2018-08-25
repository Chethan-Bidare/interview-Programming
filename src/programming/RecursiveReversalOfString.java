package programming;

public class RecursiveReversalOfString {

	String reverse = "";
	
	public String reverseString(String str){
		if(str.length()==1){
			return str ;
		}
		else {
			reverse+= str.charAt(str.length()-1) + reverseString(str.substring(0, str.length()-1));
			return reverse ;
		}
	}
	public static void main(String[] args) {
		
		RecursiveReversalOfString rrs = new RecursiveReversalOfString();
		System.out.println(rrs.reverseString("chethan"));
	}

}
