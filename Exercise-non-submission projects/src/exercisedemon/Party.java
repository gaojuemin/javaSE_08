package exercisedemon;

class Party {
	public void puffBall() {
		class Ball {
			public void puff() {
				System.out.println("qi qiu pengzhang le");
			}
		}
		new Ball().puff();
	}

public static void main (String[] args) {
	Party p = new Party();
	p.puffBall();
}
}