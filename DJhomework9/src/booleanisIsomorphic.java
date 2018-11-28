import java.util.ArrayList;

/*
 * Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true

You may assume both s and t have the same length.
 */
public class booleanisIsomorphic {
	public static void main(String[] args) {
		String s = "ab";      // ""是true,a and a是true, ab and ac是true，ab 和aa是false。
		String t = "ca";
		System.out.println(isIsomorphic(s, t));
	}

	public static boolean isIsomorphic(String s, String t) {
		if (s.equals("") && t.equals("")) {
			return true;
		}
		if (s.length() != t.length()) {   //长度不等肯定不是一样的
			return false;
		}
		if (s.equals(t)&&s.length()==1) {
			return true;
		}
		
		char[] x;
		char[] y;
		x = s.toCharArray();
		y = t.toCharArray();
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println();
		

		for (int i = 0; i < x.length; i++) { // 对应位置的字符ascii码相减，组成一个list，如果有一样的就认为模式相同
			list.add(i, (int) x[i] - (int) y[i]);
		}
		for(int i =0;i<2;i++) {
			if (((list.get(i)==0)&&x[i]!=x[i+1])&&((list.get(i)==0)&&y[i]!=y[i+1])) { 
				return true; // ab and ac是true，ab 和aa是false
			}
			}
		
		/*for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if ((list.get(i) - list.get(j) == 0) && ((x[i] == x[j])||x.length<2)) { // 数组内如有重复数，说明字母相同&&排除正好遇到差值一样的情况
					return true;
				}
			}
		}*/
		
		if (list.)
		return false;
	}
}
