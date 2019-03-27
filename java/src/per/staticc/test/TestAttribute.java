package per.staticc.test;

import org.junit.Test;

/**
 * static成员变量例子   attribute:属性
 * @author TongQiLong
 * 实例变量属于对象
 * 静态变量只有一个，被类拥有，所有对象都共享这个静态变量
 * 与c++不同是java中static不能再方法中定义
 */
public class TestAttribute {
	public static int staticInt;//自动初始化为0
	public int nostaticInt = 0;
	public static void main(String[] args) {
		TestAttribute t = new TestAttribute();
		System.out.println("t.staticInt="+t.staticInt);
		System.out.println("TestAttribute.staticInt="+TestAttribute.staticInt);
		System.out.println("t.nostaticInt="+t.nostaticInt);
		System.out.println("对静态变量和 实例变量+1");
		t.staticInt++;
		t.nostaticInt++;
		TestAttribute t1 = new TestAttribute();
		System.out.println("t1.staticInt="+t1.staticInt);
		System.out.println("TestAttribute="+TestAttribute.staticInt);
		System.out.println("t1.nostaticInt="+t1.nostaticInt);
		
	}
	@Test
	public void testString() {
		String string = "a"+"b"+"c";//这里直接初始化为一个实例。
		String string2= "a";
		string2 +="b";//这里是两个实例
		System.out.println(string2=="ab");
		System.out.println(string=="abc");
	}
	@Test
	public void TestarrayList() {
//		int[] a = null;这里初始化是错误的
//		a= {1,2};//编译出错
		int[] a = new int[7];//默认初始值为0//括号中有值不能再后面进行初始化值{}
		int[][] a1 = {{1,2,3},{2,3,4}};//二维数组初始化
		int[][] a2= new int[][]{{1,2,3,4,5},{2,3,4,5,6}};
		//初始化第二种。
		int[] a3;
		a3= new int[] {1,23,54};
		//数组初始化第三种。
		int[] a4 = {1,23,5};
		System.out.println(a);
		int[][] a5 = new int[2][];
		a5[0] =new int[]{1,2,3};
		a5[1] = new int[] {3,5,6};
	
	}
}
