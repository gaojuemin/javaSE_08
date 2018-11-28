
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;


/*
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 */

class FindAnagrams {
	public static void main(String[] args) {
		String s = "abab";
		String p = "ba";
		String s1 = "cbaebabacd";
		String p1 = "abc";
		if (1<2) System.out.println(",,,,,,,,,,,,");
		for (int i = 0; i < findAnagrams2(s, p).size(); i++) {
			System.out.print(findAnagrams(s, p).get(i));
			System.out.print(",");
		}
		}

	public static ArrayList<Integer> findAnagrams(String s, String p) {
		ArrayList l = new ArrayList(); // 建立返回的list，简写l
		char[] ch1 = p.toCharArray();
		Arrays.sort(ch1); // 总体思想，课上学过比对字符串
		String s1 = Arrays.toString(ch1);
		
	 //这里加一个把需要比对字符串进行排序，这样就可以比对任意顺序的字符串
		for (int i = 0; i <= s.length() - p.length(); i++) { // 减去p长度是为了不越界,一个一个比较
			char[] ch2 = (s.substring(i, i + p.length())).toCharArray();// 从index i开始，p长度结束，挨个比较字符串
			Arrays.sort(ch2);
			String s2 = Arrays.toString(ch2);
			if (s2.equalsIgnoreCase(s1)) {
			//int count = 0;
			//for (int j = 0; j < ch2.length; j++) {
			//	if (ch2[j] == ch1[j]) {
			//		count++;
			//	}
			//}
			//if (count == ch2.length) {
			l.add(i);
			}
		}
		return l;
	}
	
	public static ArrayList<Integer> findAnagrams2(String s, String p) {
		ArrayList l = new ArrayList(); // 建立返回的list，简写l
		char[] ch1 = p.toCharArray();
		
		Arrays.sort(ch1); // 总体思想，课上学过比对字符串
		String p1 = new String(ch1);
	
	 //这里加一个把需要比对字符串进行排序，这样就可以比对任意顺序的字符串
		for (int i = 0; i <= s.length() - p.length(); i++) { // 减去p长度是为了不越界,一个一个比较
			// 从index i开始，p长度结束，挨个比较字符串
			char[] ch2 = (s.substring(i, i + p.length())).toCharArray();
			Arrays.sort(ch2);
			String s1 = new String(ch2);
			//System.out.println("s   "+s1);
			
			if (s1.equals(p1)) {
			l.add(i);
			}
		}
		return l;
	}
	
	public static ArrayList<Integer> findAnagrams3(String s, String p) {
		ArrayList l = new ArrayList(); // 建立返回的list，简写l
		char[] ch1 = p.toCharArray();
		Arrays.sort(ch1); // 总体思想，课上学过比对字符串
		byte[] bb1 = getBytes(ch1);
		
	 //这里加一个把需要比对字符串进行排序，这样就可以比对任意顺序的字符串
		for (int i = 0; i <= s.length() - p.length(); i++) { // 减去p长度是为了不越界,一个一个比较
			char[] ch2 = (s.substring(i, i + p.length())).toCharArray();// 从index i开始，p长度结束，挨个比较字符串
			Arrays.sort(ch2);
			byte[] bb2 = getBytes(ch2);
		
			
			int count = 0;
			for (int j = 0; j < bb2.length; j++) {
			if (bb2[j]-bb1[j]==0) {
					count++;
				}
			}
			if (count == ch2.length) {
			l.add(i);
			}
		}
		return l;
	}
		private static byte[] getBytes (char[] chars) {
			Charset cs = Charset.forName ("");
			CharBuffer cb = CharBuffer.allocate (chars.length);
			cb.put (chars);
			cb.flip ();
			ByteBuffer bb = cs.encode (cb);
			return bb.array();
		
}
		
}
