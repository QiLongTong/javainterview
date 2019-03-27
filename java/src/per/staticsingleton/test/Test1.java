package per.staticsingleton.test;

public class Test1 {
	public static void main(String[] args) {
		SingletonA a1 = SingletonA.getInstance();
		SingletonA a2 = SingletonA.getInstance();
		System.out.println(a1);//是同一个对象
		System.out.println(a2);
		System.out.println(a1==a2);
		
	}
}
