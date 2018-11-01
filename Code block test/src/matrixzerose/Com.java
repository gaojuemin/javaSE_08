package matrixzerose;




	public class Com {
	      public void openComputer() {
	          System.out.println("�ʼǱ�����");
	      }
	      public void closeComputer() {
	          System.out.println("�ʼǱ��ػ�");
	      }
	      //ʹ��USB�豸
	      //�����Ĳ���������USB�豸
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
        System.out.println("�������");
    }
    public  void  close() {
        System.out.println("�ر����");
    }
}

class Keyboard  implements USB {
    public  void  open() {
        System.out.println("��������");
    }
    public  void  close() {
        System.out.println("�رռ���");
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



