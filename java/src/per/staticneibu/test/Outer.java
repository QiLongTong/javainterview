package per.staticneibu.test;

public class Outer {
	static int n = 5;
	static class Inner{
		void accessAttrFromOuter() {
			System.out.println("Inner:Outer.n="+n);
		}
	}
	public static void main(String[] args) {
		Outer.Inner oiInner = new Outer.Inner();
		oiInner.accessAttrFromOuter();
	}
}
