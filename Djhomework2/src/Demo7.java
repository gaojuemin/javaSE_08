//7.����1-100֮��������ж��ٸ����������Լ�����������ӡ�ڿ���̨��
public class Demo7 {
	public static void main (String[] args) {
		int count = 0;
		for (int i = 2; i <= 100; i++) {   //�ж�2-100������Щ��������1�����������⡣ 
			if (prime(i)) {               //����Ҫ�жϵ��������жκ��������жϡ�
				System.out.println(i);   //����Ǿʹ�ӡ��
				count++;                 //countΪ�ж��������ļ���������һ�������Լ�1.
				}
			}
		System.out.println("total prime is "+count);	
			
		}

//���³�����жϴ������num�ǲ�������������Ǿͷ���true				
public static boolean prime(int num){
	for(int i=2;i<num;i++) {     //�жϱ�׼��ֻ�ܱ�1�ͱ��Լ�����������Ϊ������
		if (num%i==0) {          //�ж�num�ǲ�����������num�ѱ�numС����������һ��
			return false;
		}
	}
	return true;
}

}