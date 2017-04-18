//Mike Vealey
//CSIT 211

import java.util.EmptyStackException;
import java.util.LinkedList;

public class LinkedListStack {

		private static LinkedList<Integer> elementList;
		
		public LinkedListStack() {
			elementList = new LinkedList<Integer>();
		}
		
		public void push(int iInteger) {
			elementList.addFirst(iInteger);
		}
		
		public int pop() throws EmptyStackException {
			int element;
			if (!elementList.isEmpty()) {
				element = elementList.removeFirst();
			} else {
				throw new EmptyStackException();
			}
			return element;		
		}
		
		public int peek() {
			return elementList.getFirst();
		}
		
		public boolean isEmpty() {
			return elementList.isEmpty();
		}

		public int size() {
			return elementList.size();
		}
		
		public String toString() {
			return elementList.toString();
		}
}
