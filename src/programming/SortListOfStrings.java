package programming;

import java.util.Arrays;

public class SortListOfStrings {

	public static void main(String[] args){
		String[] arr = {"Jan","feb","March","April","May","June","july","aug","Sept","Oct","Nov","Dec" };

		Arrays.sort(arr,String.CASE_INSENSITIVE_ORDER);
		for(String str : arr){
			System.out.println(str);
		}
	}
}
