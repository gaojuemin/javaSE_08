package matrixzerose;

public class ArgumentsDemo01 {
	public static void main(String[] args) {
		int a=5;
		int b=10;
		change(a, b);//调用方法时，传入的数值称为实际参数
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

	public static void change(int a, int b){//方法中指定的多个参数称为形式参数
		a=200;
		b=500;
		System.out.println(a+" "+b);
	}
}

