//存储功能，总览功能，随机点名功能。
package exercisedemon;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;;
public class Utils<student> {
	
	public void store (student student) {
		ArrayList<student> students = new ArrayList<student>
		students.add(student);
		
		
	}
	public void shows (ArrayList<student> sts) {
		for (Student Student:sts)
		{
			System.out.println(student);
		}
		;
	}
	public Student randomGenerate (ArrayList<student> sts) {
		Random random = new Random();
		int index random.nextInt(sts.size());
		
		return sts.get(index);
		
		;
	}


}

