/*9.��ϰ��(��������Ĵ���)
 * for(int x=1; x<=10; x++) {
		if(x%3==0) {
			if (x / 3 == 1){
				break;
			}
		}
		System.out.println(��Java�����ࡱ);
	}
	
	�����ڿ���̨���2��:��Java�����ࡰ
	for (int x = 1; x <= 10; x++) {
			if (x % 3 == 0) {
				continue;
			}
			System.out.println("Java������");
		}
	�����ڿ���̨���7��:��Java�����ࡰ
	
	�����ڿ���̨���13��:��Java�����ࡰ
*/
public class Demo9 {
	public static void main (String[] args) {
	for (int x = 1; x <= 10; x++) {
		if (x % 3 == 0) {
			System.out.println("Java������");
		}
		System.out.println("Java������");
	}
	}
}
