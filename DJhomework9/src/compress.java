import java.util.ArrayList;

/*
 * Given an array of characters, compress it in-place.

The length after compression must always be smaller than or equal to the original array.

Every element of the array should be a character (not int) of length 1.

After you are done modifying the input array in-place, return the new length of the array.

 
Follow up:
Could you solve it using only O(1) extra space?

 
Example 1:

Input:
["a","a","b","b","c","c","c"]

Output:
Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]

Explanation:
"aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".
 

Example 2:

Input:
["a"]

Output:
Return 1, and the first 1 characters of the input array should be: ["a"]

Explanation:
Nothing is replaced.
 

Example 3:

Input:
["a","b","b","b","b","b","b","b","b","b","b","b","b"]

Output:
Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].

Explanation:
Since the character "a" does not repeat, it is not compressed. "bbbbbbbbbbbb" is replaced by "b12".
Notice each digit has it's own entry in the array.
Note:

All characters have an ASCII value in [35, 126].
1 <= len(chars) <= 1000.
 */
public class compress {
	public static void main(String[] args) {
		// System.out.println(charToByteAscii2('a'));
		char[] ch1 = { 'a', 'b', 'b', 'c', 'c', 'c' };
		compress(ch1);
	}
	private static void compress(char[] chars) {
		int count = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 35; i <= 126; i++) { // 字符范围
			for (int j = 0; j < chars.length; j++) { // 需要比较的字符与比较范围内的所有字符对一遍，如果有就加1.
				if ((int) chars[j] == i) {
					count++;
				}
			}
			list.add(i - 35, count); // 把得到的字符的个数加入list表，index35可以标识是哪个字符，count是个数。
			count = 0; // 重置计数器。
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != 0) {
				System.out.print((char) (i + 35)); //+35恢复前面i=35开始的关系，为了转码。
				System.out.print(list.get(i));
				System.out.print(" ");
			}

		}

	}
}
