package programming;

import java.util.ArrayList;

public class RemoveDuplicatesInArray {
	
	public void removeDuplicates(int[] array){
		ArrayList<Integer> noDuplicates = new ArrayList<>();
		for(int i=0; i<array.length; i++){
			boolean isUnique = true ;
			for(int j=i+1; j<array.length; j++){
				if(array[i]==array[j]){
					isUnique=false ;
				}
			}
			if(isUnique==true){
				noDuplicates.add(array[i]);
			}
		}
		System.out.println(noDuplicates);
	}
	
	public static void main(String[] args){
		RemoveDuplicatesInArray rm = new RemoveDuplicatesInArray();
		int[] array = {10,10,20,20,30,50,40,50} ;
		rm.removeDuplicates(array);
	}

}
