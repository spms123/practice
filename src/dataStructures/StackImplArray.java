package dataStructures;

public class StackImplArray {
	
	private static final int MAX = 3;
	int[] stackArr = new int[MAX];
	private int top;
	
	
	public StackImplArray() {
		// TODO Auto-generated constructor stub
		top = -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImplArray s = new StackImplArray();
		
		s.push(6);
		System.out.println(s.peek() + " last element");
		s.push(3);
		System.out.println(s.peek() + " last element");
		s.push(2);
		System.out.println(s.peek() + " last element");
		s.push(1);
		System.out.println(s.pop() + " Popped from stack");
		System.out.println(s.pop() + " Popped from stack"); 
		System.out.println(s.pop() + " Popped from stack"); 
		System.out.println(s.pop() + " Popped from stack"); 
		
		System.out.println(s.peek() + " last element");
	}

	private Boolean push(int data) {
		// TODO Auto-generated method stub		
		if(top>=MAX-1) {
			System.out.println("Stack full for the element " + data);
			return false;
		}else {
			stackArr[++top] = data;
			return true;
		}
			
	}
	
	private int pop() {
		// TODO Auto-generated method stub		
		if(top < 0) {
			System.out.println("Stack empty");
			return 0;
		}else {
			int x = stackArr[top];
			top--;
			return x;
		}
			
	}
	
	private int peek() {
		// TODO Auto-generated method stub		
		if(top < 0) {
			System.out.println("Stack empty");
			return 0;
		}else {
			return stackArr[top];
		}
	}
	
	private boolean isEmpty() {
		return top < 0;
	}

}
