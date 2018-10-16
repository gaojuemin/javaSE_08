package matrixzerose;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class arraylist {
	public static void main(String[] args) {
		ArrayList<String> arrayList =new ArrayList<String>();
		//ArrayList<Integer>arrayList2=new ArrayList<Integer>();
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("d");
		
	System.out.println("1"+arrayList+",");	
	//arrayList.add(1,"r");
	//System.out.println("2"+arrayList+",");
	//arrayList.set(1,"r");
	//System.out.println("2"+arrayList+",");
	}
}

/*	for (String element:arrayList) {
		System.out.println(element+",");
	}
	}
	
	//效率最高，迭代。
	for(Iterator iterator=arrayList.iterator();iterator.hasNext();) {
		String string = (String) iterator.next();
		System.out.println(string+",");

}*/
