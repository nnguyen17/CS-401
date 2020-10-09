/*
# FILE: CharStack.java
# USAGE: --
# DESCRIPTION: 
# OPTIONS: --
# REQUIREMENTS: --
# BUGS: --
# AUTHOR: xXxSpicyBoiiixXx (Md Ali)
# ORGANIZATION: --
# VERSION: 1.0
# CREATED: 09/26/2020
REVISION: --
*/

package Lab05;
//Implement your own stack, CharStack, using Linked list.
//You shall not use the default Linked List class from Java. 
//Element in CharStack is CharNode which contain a char.
public class CharStack<Test> {
	
	private CharNode<Test> top;
//protected CharNode<Test> top;
    
	public CharStack() {
		
        top = null;
    }
	
	// Initialize a new CharStack with a char. 
	// It means the stack will contain an element, a CharNode which carries the input char. 
	public CharStack(Test data) {
        // 1. Filling your code here
		
		}
		// 1. End of code
    }
	
	
	// Initialize a new CharStack with a existing CharStack. It's copying the input CharStack and create a new one. 
	// Hint:
	// Do not modify the input CharStack
	public CharStack(CharStack cs) {
		// 2. Filling your code here
		
		
		// 2. End of code
    }
	
	// Create a CharStack. The stack shall contain all the charactors in input string.
	// Hint
	// The last char in string shall be at the top of the stack.
	public CharStack(String str) {
		// 3. Filling your code here
		
		// 3. End of code
    }
    // push a char to the top of the stack
    public void push(char x) { // Big O (1)
        // 4. Filling your code here
		CharNode<Test> newNode = new CharNode<>(data, null);
		
		if (top == null) {
			top = newNode;
		}
		else {
			newNode.setNode(top);
			top = newNode;}
		// 4. End of code
    }
    
	// pop the top char from the stack
	// Hint
	// For you convenience, you are not required to handle exception when poping a empty stack. 
	// It means when a stack is empty,  do nothing.
    public void pop() {
		// 5. Filling your code here
		if(top == null) {
			throw new StackUnderflowException("The list is empty");
		}
		else if (top.getNode() == null)
		{
			top = null;
		}
		else {
			top = top.getNode();
			}
		
		// 5. End of code
    }
	// return the char of the top element
    public char top() {
		// 6. Filling your code here
		return top;
		// 6. End of code
    }
    
	// return true if the stack is empty, otherwise, return false;
    public boolean isEmpty() { 	
		return top == null;
    }
    
    // return the number of elements in the stack
	public int size(){
	
	}
	//  transfer the stack to a string and return it.
	// E.g. From bottom to the top, if the chars in stack are 'a', 'e', 'c', '!'. The return shall be "aec!" 
	public String toString() {
		// 9. Filling your code here
		
		// 9. End of code
	}
}
