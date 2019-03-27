package per.assertt.test;
/**
 * 
 * @author TongQiLong
 * 如果用assert来控制了程序的业务流程，调试结束后去掉assert是
 * 很危险的，这样意味着改变了程序的正常逻辑
 */
public class Test {
	public static void main(String[] args) {
		assert 1+1==2;
		System.out.println("assert1 ok");
		/**
		 * Run as -> 
		 * Run Configurations -> 
		 * Arguments -> 
		 * VM arguments：敲入-ea即可。
		 */
		assert 1+1==3:"assert faild,exit";
		System.out.println("assert2 ok");
	}
}
