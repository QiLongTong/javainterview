package per.super1.test;



class Base{
	public String name ="我是父类成员变量";
	 
	public Base() {//构造函数
		System.out.println("父类构造=Base");
	}
	public void f() {
		System.out.println("Base:f()");
	}
}
class Sub extends Base{
	public String name ="我是子类成员变量";
	
	public Sub() {
		//super();
		System.out.println("子类构造=Sub");
		/**
		 * Constructor call must be the first statement in a constructor
		 * 当子类构造函数要显示调用父类构造函数时候，super();必须为构造函数的第一句
		 */
		
	}
	public void f() {
		System.out.println("Sub:f()");	
	}
	public void subf() {
		f();//子类的方法
	}
	public void basef() {
		super.f();//super可以用来访问父类方法或成员变量
		
	}
	public void subname() {
		System.out.println("子类成员变量="+name);//
	}
	public void basename() {
		System.out.println("父类成员变量="+super.name);//父类的成员变量
	}
}
public class Test {
	public static void main(String[] args) {
		System.out.println("Base b = new Sub()");
		Base b = new Sub();
		//b.subf();//向上转型丢掉与父类不同没有的方法
		System.out.println("向上转型丢掉与父类不同没有的方法,子类与相同的方法进行覆盖");
		b.f();//子类与相同的方法进行覆盖
		System.out.println("Sub sub=new Sub()");
		Sub sub = new Sub();
		sub.subf();
		
		sub.basef();
		System.out.println("访问子类成员变量");
		sub.subname();
		System.out.println("访问父类成员变量");
		sub.basename();
	}
	
	
	
	
}
