package matrixzerose;

public class callname {
	public static void main(String[] args) {
	
		String[] students = savename();
		showname(students);
		
	}
	public static String[] savename() {
		String []name= {"A","B","C","D","E","F","G"};
		return name;
		
	}
	public static void showname(String[] arr) {
		String[] students = savename();
		for(int i=0;i<arr.length;i++) {
			System.out.print(students[i]+" ");
			
			
		}
		
	}
	//存储姓名
	//总览姓名
	//随机点名
}
