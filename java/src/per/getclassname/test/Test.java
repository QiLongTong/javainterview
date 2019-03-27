package per.getclassname.test;
/**
 * 
 * @author TongQiLong
 *	获取类名
 * 思考是否可以调用父类的getClass().getName()获取父类的的类
 * 不可以getClass()方法在Object中被定义final与native，子类不能覆盖该方
 * 法。
 * 反射机制使用getSuperclass()获取的
 */

class A{}
public class Test extends A {
	public void test() {///
		System.out.println(this.getClass().getSuperclass().getName());
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.test();
	}
}
