package per.string.test;

public class Test {
	static {//在main()方法之前被加载
		System.out.println("静态代码块：Hello World");
	}
	public static void main(String[] args) {
		String string = "abcdef";
		byte[] bytes=new byte[] {97,98,99,100};
		String string2 = new String(bytes,0,bytes.length);
		System.out.println(string2);
	
	}
}
