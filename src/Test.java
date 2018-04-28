//1 10 11 100 101 110 111 110
public class Test {
	public static void main(String[] args) {
		printBinaryInt(-1);
	}

	static void printBinaryInt(int i) {
		for (int j = 31; j >= 0; j--)
			if (((1 << j) & i) != 0)
				System.out.print("1");
			else
				System.out.print("0");
		System.out.println();
	}
}
