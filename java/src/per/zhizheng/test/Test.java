package per.zhizheng.test;



//通过接口定义一种比较大小的方法
interface IntCompare{
	public int cmp(int a,int b);
}
class Cmp1 implements IntCompare{
	public int cmp(int a,int b) {
		if(a>b) {//a>b就是要调整顺序
			//a>b是得到的真实顺序，不是想要的，返回1，表示想要调整顺序
			return 1;
		}else if(a<b){
			
			return -1;
		}else {
			return 0;
		}
	}
}
class Cmp2 implements IntCompare{
	public int cmp(int a,int b) {
		if(a>b) {//降序
			return -1;//看正负1即可，-1为不想调整顺序
		}if(a<b) {
			return 1;
		}else {
			return 0;
		}
	}
}
public class Test {
	public static void insertSort(int[] a,IntCompare cmp) {
		if(a!=null) {
			for(int i=1;i<a.length;i++) {
				int temp = a[i],j=i;
				if(cmp.cmp(a[j-1], temp)==1) {
					while(j>=1&&cmp.cmp(a[j-1], temp)==1) {
						a[j] = a[j-1];
						j--;
					}
				}
				a[j] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int[] array1 = {7,3,19,40,4,7,1};
		insertSort(array1, new Cmp1());
		System.out.println("升序排列");
		for(int i:array1) {
			System.out.print(i+" ");
		}
//		Collection list = Arrays.asList(array1);
//		for(Iterator iterator=list.iterator();iterator.hasNext();) {
//			Object object = iterator.next();
//			System.out.println(object);
//		}//此处打印全是地址
		System.out.println();
		insertSort(array1, new Cmp2());
		
		System.out.println("降序排列");
		for(int i:array1) {
			System.out.print(i+" ");
		}
	}

}
