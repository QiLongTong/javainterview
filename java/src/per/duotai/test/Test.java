package per.duotai.test;
class Base{
	public int i = 1;
	public Base() {
		g();
	}
	public void f() {
		System.out.println("Base.f()");
	}
	public void g() {
		System.out.println("Base.g()");
	}
}
class Sub extends Base{
	public int i = 2;
	public void f() {
		System.out.println("Sub.f()");
	}
	public void g() {
		System.out.println("Sub.g()");
	}
}
public class Test {
	public static void main(String[] args) {
		Base b = new Sub();//这句会调用父类的构造方法
		//向上转型父类的引用(b)指向子类，
		//创建时候先调用父类构造方法，
		//又因为子类何父类方法重名所以子类对父类进行覆盖
		
		b.f();
		b.g();
		/**
		 * 只有类中方法才有多态，成员变量没有多态
		 * 成员变量的值取父类还是子类不取决于创建对象的类型，取决于定义变量的类型
		 */
				System.out.println(b.i);//这里还是成员变量
	}
}
