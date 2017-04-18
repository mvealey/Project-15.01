//Mike Vealey
//CSIT 211

public class LinkedListStackDriver {

	public static void main(String[] args) {
		LinkedListStack myStack = new LinkedListStack();
		
		//push
			myStack.push(1);
			myStack.push(2);
			myStack.push(3);
			
			System.out.println("toString = " + myStack.toString());
		
		//pop
			System.out.println("pop = " + myStack.pop());
		
		//peek
			System.out.println("peek = " + myStack.peek());
		
		//isEmpty
			if(myStack.isEmpty()) {
				System.out.println("The Stack is empty.");
			} else {
				System.out.println("The stack is not empty.");
			}
		
		//size
			System.out.println("size = " + myStack.size());
		
		//toString
			System.out.println("toString = " + myStack.toString());
	}

}
