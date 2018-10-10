//10.我国最高山峰是珠穆朗玛峰，8848米。现在我有一张足够大的纸，它的厚度是0.01米。请问，我折叠多少次，可以折成珠穆朗玛峰的高度。
public class Demo10 {
	public static void main(String[] args) {
		double i = 0.01; // 纸厚度
		int count = 0; // 折叠计数
		while (i <= 8848) { // 不知循环次数用while判断
			i = i * 2; // 折一次是原来的两倍
			count = count + 1;
		}
		System.out.println("我折叠" + (count - 1) + "次，可以折成珠穆朗玛峰的高度");
	}
}
