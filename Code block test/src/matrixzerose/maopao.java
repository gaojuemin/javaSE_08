package matrixzerose;

import java.util.Random;

public class maopao {
	public static void main(String[] args) {
		long currentTimeMillisl1 = System.currentTimeMillis();
		int N[] = new int[10000];  
		Random r = new Random();          
		for (int i = 0; i < N.length; i++) {    
			int a = r.nextInt(100);
			N[i] = a;
		}
		int temp;                          
		System.out.println("数组原顺序为");        
		for (int k = 0; k < N.length; k++) {
			System.out.print(" " + N[k]);
		}
		for(int i=0;i<N.length-1;i++) {    
			for (int j=0;j<N.length-1-i;j++ ) {
				if(N[j]>N[j+1]) {          
					temp = N[j];
					N[j]=N[j+1];
					N[j+1]=temp;
				}
			}
				}
	
		System.out.println();  
		System.out.println("按照从小到大排序后的顺序为：");
		for (int a =0;a<N.length;a++) {
		System.out.print(" "+N[a]);}
		System.out.println();
		long currentTimeMillisl2 = System.currentTimeMillis();
		System.out.println(currentTimeMillisl2-currentTimeMillisl1);

	}
}
