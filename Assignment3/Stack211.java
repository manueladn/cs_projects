import java.util.ArrayList;

public class Stack211 <T>{

	static int stackTop;
	ArrayList <T>myStack = new ArrayList <T>();
	static char c;
	static boolean Empty;

	Stack211() { // constructor
		stackTop = -1;				// stackTop is a placeholder or marker. -1 means our stack is empty.
	}

	public void push(T c) {		// This method pushed the next character or value onto the stackTop.
		stackTop++;
		myStack.add(c);
	}

	public T pop() {				// This method pops the value/character at the stackTop.
		T c = myStack.get(stackTop);
		stackTop--;
		return (T) c;
	}

	public boolean isEmpty() {		// Boolean checks if stack is empty. If it's -1, it is. If is not -1, is not empty.
		if (stackTop == -1) {
			Empty = true;
		} else {
			Empty = false;
		}
		return Empty;

	}


}
