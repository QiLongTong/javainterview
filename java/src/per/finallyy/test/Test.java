package per.finallyy.test;

public class Test {
	public static int testFinally() {
		try {
			return 1;//先执行finally在执行return1；
		}catch (Exception e) {
			return 0;
		}finally {
			System.out.println("execut finally");
			return 3;//finally种有其他语句时会覆盖函数种其他return语句
		}
		
		
	}
	public static void main(String[] args) {
		int result = testFinally();
		System.out.println(result);
	}
}
