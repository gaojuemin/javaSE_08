package matrixzerose;

public class ArgumentsDemo01 {
	public static void main(String[] args) {
		int a=5;
		int b=10;
		change(a, b);//���÷���ʱ���������ֵ��Ϊʵ�ʲ���
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

	public static void change(int a, int b){//������ָ���Ķ��������Ϊ��ʽ����
		a=200;
		b=500;
		System.out.println(a+" "+b);
	}
}

