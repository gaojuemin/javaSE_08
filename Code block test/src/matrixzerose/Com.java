package matrixzerose;




	public class Com {
	      public void openComputer() {
	          System.out.println("笔记本开机");
	      }
	      public void closeComputer() {
	          System.out.println("笔记本关机");
	      }
	      //使用USB设备
	      //方法的参数，就是USB设备
	      public void useUSB(USB usb) {
	           usb.open();
	           usb.close();
	      }

	}



interface USB {
    public  abstract void  open();
    public  abstract void  close();
}

class Mouse  implements USB {
    public  void  open() {
        System.out.println("开启鼠标");
    }
    public  void  close() {
        System.out.println("关闭鼠标");
    }
}

class Keyboard  implements USB {
    public  void  open() {
        System.out.println("开启键盘");
    }
    public  void  close() {
        System.out.println("关闭键盘");
    }
}


class Test {
    public static void main(String[] args) {
 
        Com com = new  Com();
        com.openComputer();
        com.useUSB(new  Mouse());


        com.useUSB(new  Keyboard()); 

        com.closeComputer();
   }
}



