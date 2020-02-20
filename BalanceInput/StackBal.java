package BalanceInput;
import java.util.Scanner;

public class StackBal {
	public NodeChar top;
	public StackBal() {
		top = null;
	}
	public void push(char ch) {
		NodeChar n = new NodeChar(ch);
		n.next = top;
		top = n;
	}
	
	public char pop() {
		NodeChar temp = null;
		if(top != null) {
			temp = top;
			top = top.next;
		}
		return temp.data;
	}

	
	public boolean isBalanced(String userInput) {
		char ch;
		char charReturn;
		int i = 0;
		int getChecker = 1;
		int size = 0;
		boolean checker = true;
		
		while(i<userInput.length()) {
			ch = userInput.charAt(i);
			if ( (ch == '(') | (ch == '[') | (ch == '{') ) {
				push(ch);
				size ++;
		    }
			if ( (ch == ')') | (ch == ']') | (ch == '}') ) {
				NodeChar temp = top;
				if(temp == null) {
					getChecker = -1;
					break;
				}
				charReturn = pop();
				size --;
				if (((charReturn == '(' && ch !=')') | (charReturn == '[' && ch !=']') | (charReturn == '{' && ch !='}'))) {
					getChecker = -1;
					break;
				}
			}
			i ++;
		}
		if(size > 0) {
			checker = false;
		}
		if(getChecker == -1) {
			checker = false;
		}
		return checker;
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput;
		boolean checker;
		
		System.out.println("Enter an input: ");
		userInput = scnr.nextLine();
		
		StackBal connect = new StackBal();
		checker = connect.isBalanced(userInput);
		
		if (checker == true) {
			System.out.println("Input is balanced.");
		}
		else {
			System.out.println("Input not balanced.");
		}

		
	}

}
