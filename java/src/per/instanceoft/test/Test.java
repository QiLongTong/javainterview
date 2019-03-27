package per.instanceoft.test;
/**
 * result = object instanceof class 
 * object是class的一个实例
 * @author TongQiLong
 *
 */
public class Test {
	public static void main(String[] args) {
		String string = "hello";
		int[] a = {1,2};
		if(string instanceof String) {
			System.out.println("true");
		}
		if(string instanceof Object) {
			System.out.println("true");
		}
		if(a instanceof int[]) {
			System.out.println(true);
		}
	}
}
