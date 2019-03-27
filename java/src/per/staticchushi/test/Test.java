package per.staticchushi.test;
/**
 * 
 * @author TongQiLong
 * JVM再加载类时会执行static代码块。
 */
public class Test {
	public static int a;
	static {//静态代码块儿加载
		Test.a = 4;
		System.out.println(a);
		System.out.println("static block is called");
	}
	public static void main(String[] args) {
		
	}
}
