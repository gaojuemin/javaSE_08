package matrixzerose;

import java.util.ArrayList;

public class arraylistname {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		savename(arrayList);
		showname(arrayList);

	}

	public static void savename(ArrayList<String> arrayList) {
		// ArrayList<String> arrayList =new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");

	}

	public static void showname(ArrayList<String> arrayList) {

		System.out.println(arrayList + ",");

	}
	// �洢����
	// ��������
	// ������� ��arrayList
}
