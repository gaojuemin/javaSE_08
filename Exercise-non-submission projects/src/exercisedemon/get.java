package exercisedemon;
import exercisedemon.MyLock;
import java.util.Random;
public class get implements Runnable{
	//面试要考
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	while (true) {
		int x = new Random().nextInt();
	
		if (x%2==0) {
			synchronized(MyLock.getLockA()) {
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				System.out.println(Thread.currentThread().getName()+" i am in locka");
			
				synchronized (MyLock.getLockB()) {
					System.out.println(Thread.currentThread().getName()+"running");
				}
				}
			}
			else {
				synchronized (MyLock.getLockB()) {
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+" i am in lockb");
					
				
					synchronized (MyLock.getLockA()) {
						System.out.println(Thread.currentThread().getName()+"running");
				}
				}
			}
		}

	}
}
	


