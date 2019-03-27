package per.neibuclass.test;

public class OuterClass {
	private  int d1 = 1;
	//编写内部类
	/*A:class InnerClass{
		//非静态内部类不能定义静态成员所以下面报错。
		public static int methodda() {return d1;}
	}*/
	/**
	 * 非静态内部类不能定义静态成员所以报错
	 * @author TongQiLong
	 *
	 */
	/*B:public class InnerClass{
		static int methoda() {
			return d1;
		}
	}*/
	/*C:这个是正确的：private class InnerClass{//非静内部类定义非静态成员
		int methoda() {return d1;}
	}*/
	/**
	 * 
	 * @author TongQiLong
	 * 静态内部类不能访问外部类的非静态成员
	 */
	/*D：static class InnerClass{
		protected int methoda() {
			return d1;
		}
	}*/
	/**
	 * 
	 */
	abstract class InnerClass{
		//加上abstract修饰不能有方法体。{}
		public abstract int methoda() ;
	}
	
}
