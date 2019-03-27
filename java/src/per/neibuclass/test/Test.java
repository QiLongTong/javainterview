package per.neibuclass.test;
//这里有错误
class outerClass{
	static class innerClass{//静态内部类有static
		
	}
}
class outer1Class{
	class innerClass{//成员内部类
		
	}
}
class outer2Class{//
	public void memberFunction() {
		class innerClass{//局部内部类
			
		}
	}
}
public class Test {

}
