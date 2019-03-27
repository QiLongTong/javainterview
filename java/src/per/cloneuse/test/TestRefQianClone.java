package per.cloneuse.test;
/**
 * 
 * @author TongQiLong
 * 1.clone的应用首先该类实现Cloneable接口
 * 2.重写clone（）方法
 * 3.clone方法中调用super.clone(); 调用java.lang.Object类的clone（）。
 * 4.把浅复制的引用指向原型对象新的克隆体。
 * 这里解决基本数据类型浅复制
 */
class Obj2 implements Cloneable{
	private int aInt = 0;
	public int getAInt() {
		return aInt;
	}
	public void setAInt(int inint) {
		aInt = inint;
	}
	public void changeInt() {
		this.aInt = 1;
	}
	@Override//调用clone（）；
	protected Object clone()  {
		Object object = null;
		try {//这里强制类型可加可不加
			object = (Obj2)super.clone();
		}catch (Exception e) {
			// TODO: handle exception
		}
		return object;
	}
}
public class TestRefQianClone {
	public static void main(String[] args) {
		Obj2 a = new Obj2();
		Obj2 b = (Obj2)a.clone();//克隆
		b.changeInt();
		System.out.println(a.getAInt());
		System.out.println(b.getAInt());
	}
}
