package matrixzerose;

public class Matrixzerose2 {
	public static void main(String[] args) {
		byte a = 1;
		a += -128;// 可以强制转换，系统规则
		System.out.println(a);
		System.out.println(getType(a));

		byte b = 1;
		// b = (int) (b - 128);// 不能强制转换，是因为变量不能重新定义
		System.out.println(b);
		System.out.println(getType(b));
	}

	public static String getType(int o) {
		return "int";
	}

	public static String getType(byte o) {
		return "byte";
	}

}
