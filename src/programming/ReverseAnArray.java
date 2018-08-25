package programming;

import java.util.ArrayList;

public class ReverseAnArray {

	public ArrayList<Integer> reversedArray(int[] array){
		ArrayList<Integer> reversedArr = new ArrayList<>();
		for(int i=array.length-1; i>=0; i--){
			reversedArr.add(array[i]);
		}
		return reversedArr ;
	}
	
	public static void main(String[] args){
		ReverseAnArray ra = new ReverseAnArray();
		int[] array = {10,20,30,40,50} ;
		System.out.println(ra.reversedArray(array));
	}
}
