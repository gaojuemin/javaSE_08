import java.util.ArrayList;

/*��������������������ֱ���ʾArrayList�����е����³��÷�����
	 *  public boolean add(Ԫ������ e)ֱ���򼯺����Ԫ��

	 *  public void add(int index,Ԫ������ e)��ָ���������򼯺����Ԫ��
	 
	 *  public Ԫ������ remove(int index)ɾ��ָ������λ�õ�Ԫ��
	 
	 *  public Ԫ������ set(int index,Ԫ������ e)�޸�ָ������λ�õ�Ԫ��
	 
	 *  public int size()��ȡ���ϳ���
	 
	 *  public Ԫ������ get(int index)����ָ��������ȡ����Ԫ��
	 *   *  public Ԫ������ set(int index,Ԫ������ e)�޸�ָ������λ�õ�Ԫ��
	 
	 *  public int size()��ȡ���ϳ���
	 
	 *  public Ԫ������ get(int index)����ָ��������ȡ����Ԫ��

*/
public class Demo5 {
	public static void main (String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0;i<10;i++) {
			list.add(i);
		}
		System.out.println("ԭ����");
		for (int i = 0;i<10;i++) {
			System.out.print(list.get(i)+" "); 
		}
		System.out.println();
		
		list.add(11);        //ֱ���򼯺����Ԫ��
		list.add(0, 12);    //0��λ�����Ԫ�أ���ͷΪ12
		list.remove(1);	    //ɾ��1��λ��Ԫ�أ�����0
		list.set(2, 18);    //���1��λ��Ԫ�أ�2�滻��18
		System.out.println("�޸ĺ󼯺�");
		for (int i = 0;i<list.size();i++) {        //��ȡ���ϳ���
			System.out.print(list.get(i)+" ");  //����ָ��������ȡ����Ԫ��
		}
		
	}

}
