/*
 * 分析以下需求，并用代码实现：
	(1)定义如下方法public static String getPropertyGetMethodName(String property);
	(2)该方法的参数为String类型，表示用户给定的成员变量的名字，返回值类型为String类型，返回值为成员变量对应的get方法的名字
	(3)如：用户调用此方法时给定的参数为"name",该方法的返回值为"getName"
 */
public class GetPropertyGetMethodName {
	public static void main(String[] args) {
		String str = "name";
		System.out.println("改变前名称为" + str);
		System.out.println("改变后名称为" + getPropertyGetMethodName(str));
	}

	public static String getPropertyGetMethodName(String property) {

		property = "get" + property.substring(0, 1).toUpperCase() + property.substring(1);

		return property;

	}

}
