/*2.��������������´��루ֻ�ü̳У������ڲ������н��в��ԡ�
	����һ��
		��Ŀ������ 
			���ԣ����� ���� ���� ����
			��Ϊ������work(��ӡ���������š����ʡ�����)
		����Ա��
			���ԣ����� ���� ����
			��Ϊ������work(��ӡ���������š�����)
	�������
		��֪ѧ�������ʦ�����£�
			����:����,����
			��Ϊ:�Է�
			��ʦ�����еķ���:����
			ѧ�������еķ���:ѧϰ
	��������
		��֪è��͹��ࣺ
			����:ë����ɫ,�ȵĸ���
			��Ϊ:�Է�
			è������Ϊ:ץ����catchMouse
			��������Ϊ:����lookHome
			*/
package homework9_10;

class Employee { // ����һ���� Ϊɶǰ���public�ͳ���
	private String Name; // ����
	private int SN; // ����
	private int Wage; // ����

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getSN() {
		return SN;
	}

	public void setSN(int SN) {
		this.SN = SN;
	}

	public int getwage() {
		return Wage;
	}

	public void setWage(int Wage) {
		this.Wage = Wage;
	}

	public void work() {
		System.out.println(
				"I am work," + "my name is " + getName() + " my SN is " + getSN() + " my wage is " + getwage());

	}
}

class People { // ���������
	private String name; // ����
	private int age; // ����

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}

	public void act() {
		System.out.print("I am "+getName()+",I am "+getage()+" old ,"+"I am eatting ,");

	}
}

class Animal { // ����������
	String colour; // ��ɫ
	int legnum; // �ȸ���

	public String getcolour() {
		return colour;
	}

	public void setName(String colour) {
		this.colour = colour;
	}

	public int getlegnum() {
		return legnum;
	}

	public void setlegnum(int legnum) {
		this.legnum = legnum;
	}

	public void eat() {
		System.out.print("I am " + getcolour() + " I have " + getlegnum() + " legs " + " I am eatting,");

	}
}

class Developer extends Employee { // ����Ա��

}

class Manager extends Employee { // ��Ŀ������
	int bonus;

	public int getbonus() {
		return bonus;
	}

	public void setbonus(int bonus) {
		this.bonus = bonus;
	}

	public void work() {
		System.out.println("I am work," + "my name is " + getName() + " my SN is " + getSN() + " my wage is "
				+ getwage() + " bonus is " + getbonus());

	}
}

class student extends People { // ѧ����

	public void sw1() {
		System.out.println("I am learning");

	}

}

class teacher extends People { // ��ʦ��
	public void sw2() {
		System.out.println("I am teaching");
	}
}

class cat extends Animal {       //è��
	public void ac1() {
		System.out.println("I can catch mouse");

	}
}

class dog extends Animal {     //����
	public void ac2() {
		System.out.println("I can look Home");
	}
}
