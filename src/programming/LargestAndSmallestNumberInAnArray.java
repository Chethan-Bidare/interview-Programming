package programming;

public class LargestAndSmallestNumberInAnArray {

	
	public void smallestAndLargestInteger(int[] array){
		int maxNum = Integer.MIN_VALUE;
		int smallNum =Integer.MAX_VALUE ;
		for(int i=0; i<array.length; i++){
			if(array[i]>maxNum){
				maxNum = array[i];
			}
			else if(array[i]<smallNum){
				smallNum = array[i];
			}
		}
		System.out.println("Largest Num : "+maxNum);
		System.out.println("Smallest Number : "+smallNum);
	}
	public static void main(String[] args) {
		LargestAndSmallestNumberInAnArray ms = new LargestAndSmallestNumberInAnArray();
		int[] array = { 30,40,10,50,80,20,15} ;
		ms.smallestAndLargestInteger(array);

	}

}
