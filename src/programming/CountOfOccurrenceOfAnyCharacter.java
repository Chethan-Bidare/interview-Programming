package programming;

public class CountOfOccurrenceOfAnyCharacter {

	public void getCount(String str, char ch){
		char[] chars = str.toCharArray();
		int count=0;
		for(Character c : chars){
			if(c.equals(ch)){
				count++ ;
			}
		}
		System.out.println("No of Occurrences of "+ch+" : "+count);
	}
	
	public static void main(String[] args){
		CountOfOccurrenceOfAnyCharacter coc = new CountOfOccurrenceOfAnyCharacter();
		String str = "today is monday";
		char ch = 'd';
		coc.getCount(str, ch);
	}
}
