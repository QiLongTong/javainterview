package per.duotai.test.vehicle;
class Vehicle{
	int w,h;
	public Vehicle() {
		
	}
	public  Vehicle(int w,int h) {
		this.w = w;
		this.h = h;
	}
}
class Car extends Vehicle{
	int w,h,l;
	Car(int w,int h,int l){
		//super(w, h);//当父类种没有提供无参构造时候，必须首行显式调用super
		//当父类种有无参构造时候，可以省略super();这种情况下编译器默认提供父类无参构造
		System.out.println("w:"+w+"h:"+h+"l:"+l);
	}
}
public class Main {
	public static void main(String[] args) {
		Vehicle car2 = new Vehicle(1,4);//出错
		Car car = new Car(12, 2, 4);
		int max = Integer.MIN_VALUE;
		int[] a = new int[] {1,2,35,};
		int[] b = new int[a.length+1];
	}
}
