import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		
		Test1 T = new Test1();
		
		System.out.println(T.nextInt(5, 20));
		System.out.println(T.nextEven(30, 50));
		System.out.println(T.nextOdd(30, 50));	
		System.out.println(T.nextCharCap());
		System.out.println(T.nextCharLow());
		System.out.print(T.nextCharCap('X', 'C') + ", ");
		System.out.println(T.nextCharCap('A', 'L'));
		System.out.println(T.nextCharLow('y', 'c'));
		System.out.println(T.nextWord(5));
		Test4 obj = new Test4();
		obj.Flowers();
	}

}
