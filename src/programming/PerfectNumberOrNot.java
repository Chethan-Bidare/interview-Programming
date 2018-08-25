package programming;

public class PerfectNumberOrNot {

	public void isPerfectNumber(int number){
		
		int temp=0;
		for(int i=1; i<=number/2; i++){
			if(number % i == 0){
				temp+= i ;
			}
		}
		
		if(temp==number){
			System.out.println(number+" is a Perfect Number");
		}
		else
		{
			System.out.println(number+" is not a perfect Number");
		}
	}
	
	public static void main(String[] args) {
		PerfectNumberOrNot pnn = new PerfectNumberOrNot();
		pnn.isPerfectNumber(4);
		
	}

}
