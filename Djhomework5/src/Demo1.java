/*1.�����������󣬲��ô���ʵ�֣�
	(1)���մӴ�С��˳�������λ���еĸ�λ+��λ=ʮλ+ǧλ(3553,2332,1166,8228,3773)�����ּ�����
	(2)ÿ�����5����������������֮���ÿո�ָ�
	(3)�磺9999 9988 9977 9966 9955 	
1001 1012 1023 1034 1045
1056 1067 1078 1089 1100
1111 1122 1133 1144 1155
1166 1177 1188 1199 1210
1221 1232 1243 1254 1265
1276 1287 1298 1320 1331
1342 1353 1364 1375 1386
1397 1430 1441 1452 1463
1474 1485 1496 1540 1551
1562 1573 1584 1595 1650
1661 1672 1683 1694 1760
1771 1782 1793 1870 1881
1892 1980 1991 2002 2013
2024 2035 2046 2057 2068
2079 2101 2112 2123 2134
2145 2156 2167 2178 2189
2200 2211 2222 2233 2244
(i%10)  gewei 
(i/10)%10 shiwei
(i/100)%10;baiwei
(1/1000)%10;qianwie

	*/
public class Demo1 {
	public static void main(String[] args) {
		int j = 0;
		for (int i = 9999; i >= 1000; i--) {
			//�����λ+��λ=ʮλ+ǧλ�ʹ�ӡ�Ǹ���
			if (((i%10)+((i/100)%10))==(((i/10)%10)+((i/1000)%10))) {
				System.out.print(i + "  ");
				j++;                    //��ӡ���ƣ�����������С�
				if (j == 5) {
					System.out.println();
					j = 0;
				}
			}

		}

	}
}