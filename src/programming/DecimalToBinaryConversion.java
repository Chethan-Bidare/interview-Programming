package programming;

public class DecimalToBinaryConversion {

	public void printBinaryFormat(int number){
		int binary[]= new int[25];
		int index = 0 ;
		
		while(number > 0){
			binary[index++]= number%2;
			number = number/2 ;
		}
		for(int i= index-1; i>=0; i--){
			System.out.print(binary[i]);
		}
	}
	
	public static void main(String[] args){
		DecimalToBinaryConversion binaryConversion = new DecimalToBinaryConversion();
		binaryConversion.printBinaryFormat(25);
	}
}
