package matrixzerose;

import java.util.Random;


//����Ԫ�����򣨴���ʵ�֣�
public class Demo6 {
		public static void main(String[] args) {
				int N[] = new int[100];  
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
					
			 
				for(int i=0;i<N.length-1;i++) {    
					for (int j=0;j<N.length-1-i;j++ ) {
						if(N[j]>N[j+1]) {          
							temp = N[i];
							N[i]=N[j];
							N[j]=temp;
						}
					}
						}
				System.out.println();  
				System.out.println("���մ�С����������˳��Ϊ��");
				for (int a =0;a<N.length;a++) {
				System.out.print(" "+N[a]);}

			}
			

		
	

		}
		               
	
		
	





