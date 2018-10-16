package matrixzerose;

import java.util.Random;
import java.util.Scanner;

public class zheban {
	public static void main (String[] args) {
	int N[] = new int[10];  
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
		
	for(int i=0;i<N.length-1;i++) {                  //使用冒泡法排序
		for (int j=0;j<N.length-1-i;j++ ) {
			if(N[j]>N[j+1]) {                    //原理如果N[1]比N[2]大，就把两数组值调换。
				temp = N[j];
				N[j]=N[j+1];
				N[j+1]=temp;
			}
		}
			}
	System.out.println();  
	System.out.println("按照从小到大排序后的顺序为：");
	for (int a =0;a<N.length;a++) {
	System.out.println(" "+N[a]);}
	System.out.println("请输入要查找的数");
	Scanner scanner = new Scanner(System.in);
	int find = scanner.nextInt();
	int min=0;
	
	int max=N.length-1;
	int mid =(min+max)/2;
	while (min <= max) {
		
		mid =(min +max)/2;
		
		if (find >N[mid]){
			mid=mid+1;
		}
	
		else if (find <N[mid]) {
		max =min-1;
		}
			
		else {
		System.out.println(mid);
		}
        
	}

	}
	
}

