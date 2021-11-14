import java.util.Scanner;
import java.util.StringTokenizer;


public class SallySpeak {
	Boolean legal = true;
	String token;
	Scanner tokenizer;
	int tokenTotal;
	int tokenCount;
	String placeholderString;
	
	public SallySpeak(String userResponse) {
		placeholderString = userResponse;
		tokenizer = new Scanner(userResponse);
		tokenCounter();
	    nextToken();
	    isLegal();
	}
	
	public void nextToken() {
		//System.out.println("nextToken Start");
		if (tokenizer.hasNext() == false) {
			token = "nothing";
		} else {
			token = tokenizer.next();
		}
		
	}
	
	public Boolean isLegal() {
		if (legal) {
			reaction();
		}
		if (legal) {
			expression();
		}
		
		while (legal && !token.contentEquals("nothing")) { 
			expression();
		}
		
		if (legal = false) {
			System.out.println("Token False");
		}
		if (tokenTotal == 0) {
			System.out.println("Error, please enter something for Sally.");
		} else {
			if (tokenCount == tokenTotal) {
				System.out.println("Sally can speak like this!");
			} else { 
				System.out.println("Sally cannot speak like this...");
			}
		}
		return legal;
	}
	
	public void reaction() {
		if (!legal) {
			return;
		}
		if (token.contentEquals("earperk")) {
			increment();
			if (token.contentEquals("tailwag")) {
				while (token.contentEquals("tailwag")) {
					increment();
				}
			}
		} else {
			legal = false;
		}
	}
	
	public void expression() {
		if (!legal) {
			return;
		}
		if (token.contentEquals("bark")) {
			increment();
			whimpergrowl();
			if (legal) {
				reaction();
			} else {
				return;
			}
		} else {
			legal = false;
		}
	}
	
	public void whimpergrowl() {
		if (!legal) {
			return;
		}
		if (token.contentEquals("whimper") || token.contentEquals("growl")) {
			increment();
		} else { 
			legal = false;
		}
	}
	
	// This is an extra method to figure out the length of the string for the main class
	public void tokenCounter() {
		StringTokenizer st = new StringTokenizer(placeholderString); {
			while (st.hasMoreTokens()) {
				tokenTotal += 1;
				st.nextToken();
			}
		}
		//System.out.println(tokenTotal);
	}
	
	public void increment() {
		tokenCount +=1;
		System.out.println(token);
		nextToken();
	}
}
