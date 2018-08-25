package programming;

public class Max2NumbersInArray {
	
	public void getMax2Numbers(int[] array){
		int firstNum = 0;
		int secondNum = 0;
		
		for(int i=0 ; i<array.length; i++){
			if(array[i]>firstNum){
				secondNum = firstNum ;
				firstNum=array[i];
			}
			else if(array[i]>secondNum){
				secondNum=array[i];
			}
		}
		System.out.println("First Max Num : "+firstNum);
		System.out.println("Second Max Num : "+secondNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10,30,50,60,20,40} ;
		Max2NumbersInArray obj = new Max2NumbersInArray();
		obj.getMax2Numbers(array);

	}

}
