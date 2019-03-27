package per.cloneuse.test;
/**
 * 
 * @author TongQiLong
 * 基本类型的值传递
 * 对象以及其他是引用传递“=” A与B两个对象相同，B的修改不影响A
 *
 */
class Obj1{
	private int aInt = 0;
	public int getAInt() {
		return aInt;
	}
//	public void setAInt(int int1) {
//		aInt = int1;
//	}
	public void changeInt() {
		this.aInt = 1;
	}
}
public class TestRef1 {
	public static void main(String[] agrs) {
		
		Obj1 a = new Obj1();
		//对象除了在函数调用时是引用传递，在使用“=”赋值时也采用引用传递
		Obj1 b = a;//采用引用传递
		b.changeInt();
		System.out.println(a.getAInt());//这里是引用将a对象改变了
		System.out.println(b.getAInt());
	}
}
