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
	System.out.println("����ԭ˳��Ϊ");        
	for (int k = 0; k < N.length; k++) {
		System.out.print(" " + N[k]);
	}
		
	for(int i=0;i<N.length-1;i++) {                  //ʹ��ð�ݷ�����
		for (int j=0;j<N.length-1-i;j++ ) {
			if(N[j]>N[j+1]) {                    //ԭ�����N[1]��N[2]�󣬾Ͱ�������ֵ������
				temp = N[j];
				N[j]=N[j+1];
				N[j+1]=temp;
			}
		}
			}
	System.out.println();  
	System.out.println("���մ�С����������˳��Ϊ��");
	for (int a =0;a<N.length;a++) {
	System.out.println(" "+N[a]);}
	System.out.println("������Ҫ���ҵ���");
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

