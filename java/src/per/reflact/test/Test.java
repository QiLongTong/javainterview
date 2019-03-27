package per.reflact.test;
class Base{
	public void f() {
		System.out.println("Base");
	}
}
class Sub extends Base{
public void f() {
	System.out.println("Sub");
	}
}
public class Test {
	//有问题
//	public static void Test1() {
//		Class classType = Class.forName(className)
//	}
	public static void main(String[] args) {
		try {//反射机制加载类
			//包的全名.类名
			 Class c = Class.forName("per.reflact.test.Sub");
			Base b = (Base) c.newInstance();
			b.f();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
