package exercisedemon;

class neibulei{
	private boolean life = true;
	public class Heart {
		public void jump() {
			System.out.println("xing zang pu teng pu teng");
			System.out.println("life is "+ life);
		}
	}


public static void main (String[] args) {
	neibulei.Heart bh =new neibulei().new Heart();
	bh.jump();
}
}