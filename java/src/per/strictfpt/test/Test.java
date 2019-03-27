package per.strictfpt.test;
/**
 * 不同计算机平台或厂商的虚拟机上会有不同的结果
 * strictfp是 strict float point的缩写，指的是精确浮点。
 * strictfp可以保证浮点数运算的精确性，造不同的硬件平台上会有一致的结果
 * @author TongQiLong
 *
 */
public strictfp class Test {
	public static void testStrictfp() {
		float f = 0.12365f;//精度8位有效数字尾数的位数来决定的
		double d = 0.03496421d;
		float t = 3.09f;//默认是double没有f的时候
		double o = 3.898988;
		double sum = f+d;
		System.out.println("float="+t);
		System.out.println("double="+o);
		System.out.println(sum);
	}
	public static void main(String[] args) {
		testStrictfp();
	}
}
