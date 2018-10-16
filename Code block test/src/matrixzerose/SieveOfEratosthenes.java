package matrixzerose;


public class SieveOfEratosthenes {
	public static void main(String[] args) {
		boolean[] num = new boolean[10001];
		for(int i = 2; i < num.length; i++){
			for(int j = 2*i; j < num.length; j = j + i){
				num[j] = true;
			}
		}
		for(int n = 2, count = 0; n < num.length; n++){
			if(!num[n]){
				System.out.print(n+",");
				count++;
				if(count%10 == 0)System.out.println();
			}
		}
		System.out.println("finish");
	}
}