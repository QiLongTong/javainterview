package per.staticsingleton.test;

public class SingletonA {
	private static SingletonA s;
	private SingletonA() {//隐藏类的构造函数
	}
	//提供创建对象的方法
	public static SingletonA getInstance() {
		if(s==null) {
			//利用锁的机制来实现同步的。
			synchronized (SingletonA.class) {
				if(s==null) {
					s = new SingletonA();
				}
			}
		}
		return s;
	}
}
