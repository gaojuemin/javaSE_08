/*
 * �����������󣬲��ô���ʵ�֣�
	(1) ����15+25+35+....+1005�ĺ�


Ч��:
51005
*/
public class Demo3 {
	public static void main(String[] args) {
		int sum=0;
		for (int i=15;i<=1005;i=i+10) {
			sum = i+sum;
		}
		System.out.println(sum);
	}

}
