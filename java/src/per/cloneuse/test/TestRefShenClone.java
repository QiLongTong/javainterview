package per.cloneuse.test;

import java.util.Date;
/**
 * 
 * @author TongQiLong
 * 深度复制
 * 思考：什么时候需要浅复制，深复制，考虑是否有非基本类型。
 */
class Obj3 implements Cloneable{
	private  Date birth = new Date();
	public Date getBirth() {//类中含有其他对象
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public void changeDate() {
		this.birth.setMonth(4);
	}
	@Override
	protected Object clone()  {
		Obj3 o = null;
		try {
			o = (Obj3) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//实现深度复制
		o.birth = (Date)this.getBirth().clone();
		return o;
	}
}
public class TestRefShenClone {
	public static void main(String[] args) {
		Obj3 a = new Obj3();
		Obj3 b = (Obj3) a.clone();//强制转换
		b.changeDate();
		System.out.println("a="+a.getBirth());
		//改变之后
		System.out.println("b="+b.getBirth());
	}
	
}
