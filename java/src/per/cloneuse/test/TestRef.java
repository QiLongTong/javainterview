package per.cloneuse.test;

import org.omg.PortableInterceptor.ServerRequestInfo;

/**
 * 
 * @author TongQiLong
 * 每一个new语句返回的都是指针引用
 */
class Obj{
	private String string = "default value";
	public void setObj(String str) {
		this.string = str;
	}
	public String toString() {
		return string;
	}
}

public class TestRef {
	private Obj obj = new Obj();
	private int aInt = 0;
	public Obj getObj() {
		return obj;
	}
	public int getAInt() {
		return aInt;
	}
	public void changeObj(Obj obj) {
		obj.setObj("change value");
	}
	public void changeAInt(int aInt) {
		aInt = 1;
	}
	public static void main(String[] args) {
		TestRef oRef = new TestRef();
		System.out.println("*********引用类型*********");
		System.out.println("调用changeObj()前"+oRef.getObj());
		oRef.changeObj(oRef.getObj());
		System.out.println("调用changeObj()后"+oRef.getObj());
		System.out.println("********基本数据类型*********");
		System.out.println("调用changeAInt()前"+oRef.getAInt());
		oRef.changeAInt(oRef.getAInt());
		System.out.println("调用changeAInt()后"+oRef.getAInt());
	}
	
}
