
public class StackCustom {
	
	static int size;
	int arr[];
	int top;
	
	StackCustom(int size){
		this.size=size;
		this.arr=new int[size];
		this.top = -1;
	}
	
	private void push(int element) {
		if(!isFull()) {
			top++;
			arr[top]=element;
			System.out.println("Pushed Element "+ element);			
		}
		else {
			System.out.println("Stack is full");
		}
	}

	private int pop() {
		if (!isEmpty()) {
			int returnTop = top;
			top--;
			System.out.println("Poped Element "+ arr[returnTop]);
			return arr[returnTop];
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	private boolean isEmpty() {
		return (top == -1);
	}
	private boolean isFull() {
		return (size -1 == top);
	}
	
	public static void main(String[] args) {
		StackCustom sc = new StackCustom(10);
		
		sc.pop();
		System.out.println("___________________");
		sc.push(10);
		sc.push(30);
		sc.push(50);
		sc.push(40);
		System.out.println("____________________");
		sc.pop();
		sc.pop();
		sc.pop();
		System.out.println("_______________________");
	}
}
