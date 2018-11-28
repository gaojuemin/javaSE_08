package exercisedemon;

public class MyLock {
	
	private static Object lockA;
	
	private static Object lockB;
	
	public static Object getLockA() {
		if (lockA == null)
			synchronized(MyLock.class) {
				lockA =new Object();
			}
		return lockA;
		
	}
	
	public static Object getLockB() {
		if (lockB == null)
			synchronized(MyLock.class) {
				lockB =new Object();
			}
		return lockB;
		
	}

}
