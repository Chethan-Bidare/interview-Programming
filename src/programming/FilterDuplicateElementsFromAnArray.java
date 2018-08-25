package programming;

public class FilterDuplicateElementsFromAnArray {
	
	
	public void getUniqueElementsInAnArray(int[] array){
		
		for(int i=0; i<array.length; i++){
			boolean isDuplicate = false ;
			for(int j=0; j<i ;j++){
				if(array[i]==array[j]){
					isDuplicate=true ;
				}
			}
			if(isDuplicate==false){
				System.out.println(array[i]);
			}
		}
	}
	
public void getUniqueElementsInAnArray(String[] array){
		
		for(int i=0; i<array.length; i++){
			boolean isDuplicate = false ;
			for(int j=0; j<i ;j++){
				if(array[i]==array[j]){
					isDuplicate=true ;
				}
			}
			if(isDuplicate==false){
				System.out.println(array[i]);
			}
		}
	}

	public static void main(String[] args) {
		int [] arr = {10,20,20,20,10,30,40,50} ;
		String[] arr1 = {"a","b","c","d","d","d","e","e","f","f","g"} ;
		
		FilterDuplicateElementsFromAnArray uniqueElements = new FilterDuplicateElementsFromAnArray();
		uniqueElements.getUniqueElementsInAnArray(arr);
		uniqueElements.getUniqueElementsInAnArray(arr1);

	}

}
