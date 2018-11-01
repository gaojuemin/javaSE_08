/*
 * 请编写一个抽象类Phone,两个抽象方法,call()  sendMessage()
   两个子类OldPhone 和 NewPhone , 其中NewPhone想添加一个玩游戏的功能. 
   请根据接口的思想实现,并用匿名内部类的方式调用玩游戏的功能.
*/

public class TestPhone { // 功能测试
	public static void main(String[] args) {
		OldPhone nokia = new OldPhone(); // 创建老电话实例
		nokia.call(); // 测试各个类
		nokia.sendMessage();
		System.out.println("-------------------------");

		class xphone extends NewPhone implements PlayGame {
			public void playgame() {
				System.out.println("I CAN PLAY GAME ON IPHONE");
			}
		}
		new xphone().call();
		new xphone().sendMessage();
		new xphone().playgame();

	}

}
