//Add two integer variables in 5 different ways using functions and control statement
public class q15 {
	static int a = 5, b = 3;

	static int add(int x, int y) {
		return x + y;

	}

	static int addUsingLoop(int x, int y) {
		int s = x;
		for (int i = 0; i < y; i++)
			s++;
		return s;
	}

	static int addUsingRec(int x, int y) {
		if (y == 0)
			return x;
		return addUsingRec(x + 1, y - 1);
	}

	static int addUsingWhile(int x, int y) {
		int s = x;
		while (y-- > 0)
			s++;
		return s;
	}

	static int addUsingArr(int x, int y) {
		int[] arr = { x, y };
		return arr[0] + arr[1];
	}

	public static void main(String[] args) {
		System.out.println(add(a, b));
		System.out.println(addUsingLoop(a, b));
		System.out.println(addUsingRec(a, b));
		System.out.println(addUsingWhile(a, b));
		System.out.println(addUsingArr(a, b));
	}
}
