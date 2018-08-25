package programming;

public class PairOfIntegersEqualToSum {

	public void getPairOfIntegers(int[] array, int sum){
		
		for(int i=0; i<array.length; i++){
			int first = array[i];
			for(int j=i+1; j<array.length; j++){
				int second = array[j] ;
				
				if(first + second == sum){
					System.out.println("Pair of Integers : ("+first+","+second+")");
				}
			}
		}
	}
	
	public static void main(String[] args){
		PairOfIntegersEqualToSum pm = new PairOfIntegersEqualToSum();
		int[] array = {3,2,3,4,1,5,6,0,8,10,-2,-4};
		pm.getPairOfIntegers(array, 6);
	}
}
