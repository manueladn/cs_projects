import java.util.*;

public class Evaluation {
    public static void main(String[] args) {
        System.out.println(postfixEvaluate("1 2 3 + * 4 5 + *"));     
        System.out.println(postfixEvaluate("2 8 4 - + 6 +")); 
    }
    
    public static int postfixEvaluate(String exp) {
	 	Stack211<Integer> t = new Stack211<Integer> ();
		Scanner value = new Scanner(exp);
		
		while (value.hasNext()) {
			if (value.hasNextInt()) {
				t.push(value.nextInt());
			} else {
				int num2 = t.pop();
				int num1 = t.pop();
				String op = value.next();
				
				if (op.equals("+")) {
					t.push(num1 + num2);
				} else if (op.equals("-")) {
					t.push(num1 - num2);
				} else if (op.equals("*")) {
					t.push(num1 * num2);
				} else {
					t.push(num1 / num2);
				}
				
			//  "+", "-", "*", "/"
			}
		}
		return t.pop();
    }
}


