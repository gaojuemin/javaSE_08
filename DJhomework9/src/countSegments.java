/*
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.

Example:

Input: "Hello, my name is John"
Output: 5
Note:



 */
public class countSegments {
	public static void main(String[] args) {

		int x = countSegments("");
		System.out.println(x);
	}
	/*
	 * public static int countSegments(String s) { 
	 * s.trim(); //去除两边空格的影响。
	 * String regex = " "; 
	 * int i = 0; 
	 * if (s=="") {
	 *  return 0; } 
	 *  else if (s!="") {
	 *   String[] temp = s.split(regex);//用空格分割字符串 ,看有多少个字符串数组，就是答案。
	 *   i = temp.length; } 
	 *   return i;
	 */

	// 第二个
	public static int countSegments(String s) {
		s.trim();
		char[] s1 = new char[s.length()];// 建S1字符数组，长度为字符串长度，分割每个字符
		s1 = s.toCharArray();
		int count = 1;
		if (s == "") {
			return 0;
		}
		if (s != "") {
			for (int i = 0; i < s.length(); i++) {
				if (s1[i] == ' ') {
					count++;
				}
			}
		}
		return count;
	}
}
