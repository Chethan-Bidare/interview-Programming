package programming;

public class CountNumberOfVowels {

	public void getCount(String str){
		char[] ch = str.toCharArray();
		int count = 0;
		for(Character c : ch){
			switch(c){
			case 'a': 
				count++ ;
				break ;
			case 'e' :
				count++ ;
				break ;
			case 'i':
				count++ ;
				break ;
			case 'o':
				count++ ;
				break ;
			case 'u':
				count++ ;
				break ;
				default :	
			}
		}
		System.out.println("count of vowels : "+count);
	}
	
	public static void main(String[] args){
		CountNumberOfVowels cv = new CountNumberOfVowels();
		String str = "How many vowels in This String";
		cv.getCount(str);
	}
}
