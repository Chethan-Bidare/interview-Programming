package programming;

public class CreateDeadLockBetweenTwoThreads {

	String str1 = "Chethan" ;
	String str2 = "Bidare" ;
	
	Thread thread1 = new Thread(" Thread 1");
	
	public void run(){
		while(true){
			synchronized (str1) {
			synchronized (str2) {
			System.out.println(str1+str2);	
			}	
			}
		}
	}
	
	Thread thread2 = new Thread("Thread 2");
	
	public void run1(){
		while(true){
			synchronized (str1) {
				synchronized (str2) {
					System.out.println("str1+str2");
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateDeadLockBetweenTwoThreads dth = new CreateDeadLockBetweenTwoThreads();
		dth.thread1.start();
		dth.thread2.start();
	}

}
