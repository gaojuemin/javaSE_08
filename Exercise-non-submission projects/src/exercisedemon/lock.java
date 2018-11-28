package exercisedemon;

public class lock {
	public static void main(String[] args) {
		get myrun =  new get();
		Thread t1=new Thread(myrun);
		Thread t2=new Thread(myrun);
		t1.start();
		t2.start();
	}
		}






