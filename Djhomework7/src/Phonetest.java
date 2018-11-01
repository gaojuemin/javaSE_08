/*8.现有两种  OldPhone NewPhone; 两个类都有call()  sendMessage() 方法(考虑向上抽取一个父类);
	    已知接口IPlay中有一个方法 playGame()，NewPhone添加玩游戏的功能;
	要求: 分别测试OldPhone和NewPhone的两个方法,再测试新手机palyGame()的方法.*/

class phone { // 抽象的父类可以发短信和打电话
	public void call() {
		System.out.println("call someone");
	}

	public void sendMessage() {
		System.out.println("send message to someone");
	}
}

interface game { // 定义一个接口，打游戏
	void playgame();
}

class Oldphone extends phone { // 定义老式电话继承电话的功能，并重写方法

	public void call() {
		System.out.println("i am a old phone,i can call someone");
	}

	public void sendMessage() {
		System.out.println("i am a old phone,i can send message to someone");
	}
}

class NewPhone extends phone implements game { // 定义新式电话继承电话功能并重写方法，添加打游戏功能，
	public void call() {
		System.out.println("i am a new phone,i can call someone");
	}

	public void sendMessage() {
		System.out.println("i am a new phone,i can send message to someone");
	}

	public void playgame() {
		System.out.println("It is newphoe,it can play game");
	}
}

public class Phonetest { // 各个类测试
	public static void main(String[] args) {
		Oldphone nokia = new Oldphone(); // 创建老电话实例
		NewPhone Iphone = new NewPhone();

		nokia.call(); // 测试各个类
		nokia.sendMessage();

		Iphone.call();
		Iphone.sendMessage();
		Iphone.playgame();
	}

}
