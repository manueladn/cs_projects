import java.util.Random;

public class Test1 extends Random {

	int rand = 0;

	public int nextInt(int low, int high) {
		rand = nextInt(high - low) + low;
		return rand;
	}

	public int nextEven(int low, int high) {

		do {
			rand = nextInt(high - low) + low;
		} while (rand % 2 != 0);
		return rand;
	}

	public int nextOdd(int low, int high) {

		do {
			rand = nextInt(high - low) + low;
		} while (rand % 2 == 0);
		return rand;
	}

	public char nextCharCap() {
		rand = nextInt(25) + 65;
		return (char) rand;
	}

	public char nextCharLow() {
		rand = nextInt(25) + 97;
		return (char) rand;
	}

	public char nextCharCap(int low, int high) {

		if (high < low) {
			rand = nextInt((91 - low) + (high - 64)) + low;
			if (rand > 90) {
				rand -= 26;
			}
		} else
			rand = nextInt(high - low) + low;
		return (char) rand;
	}

	public char nextCharLow(int low, int high) {

		if (high < low) {
			rand = nextInt((123 - low) + (high - 96)) + low;
			if (rand > 122) {
				rand -= 26;
			}
		} else
			rand = nextInt(high - low) + low;
		return (char) rand;
	}

	public String nextWord(int length) {
		String s = "";
		for (int i = 1; i <= length; i++) {
			rand = nextInt(25) + 65;
			s = s + (char) rand;
		}
		return s;
	}
	
}
