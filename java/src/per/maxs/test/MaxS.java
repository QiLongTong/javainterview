package per.maxs.test;

import java.util.Stack;

/**
 * 求最大面积
 * @author TongQiLong
 *
 */
public class MaxS {
	public static void main(String[] args) {
		int[] heights = new int[] {2,1,5,6,2,3};
		int maxvalues = largestRectangleArea(heights);
		System.out.println(maxvalues);
	}

	public  static int largestRectangleArea(int[] heights) {
		if(heights==null||heights.length==0) {
			return 0;
		}
		//最大值
		int maxValue = 0;
		Stack<Integer> result = new Stack<>();
		int i=0;
		for(;i<heights.length;i++) {
			//栈为空，或栈顶元素top对应的heights[top]小于heights[i],入栈
			if(result.empty()||heights[result.peek()]<=heights[i]) {
				result.push(i);
			}else {
				int top = result.pop();
				//求矩形长度
				int index = result.empty()?-1:result.peek();
				maxValue = Math.max(maxValue, heights[top]*(i-1-index));
				//再次比较heights[i]与此时的栈顶元素
				i--;
			}
		}
		while(!result.empty()) {
			//对每个栈顶元素top求矩形面积
			int top = result.pop();
			int index = result.empty()?-1:result.peek();
			maxValue = Math.max(maxValue, heights[top]*(i-1-index));
		}
		return maxValue;
	}
}
