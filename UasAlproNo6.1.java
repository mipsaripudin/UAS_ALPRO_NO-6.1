public class UasAlproNo61 {
	public static void UasAlproNo61 (int n) {
		int x, y;
		for (x = 1; x < n; x++) {
			for (y = 1; y <= x; y++) {
				System.out.print(y+" ");
			}
			System.out.println();
		}

	}
	public static void main (String args[]) {
		int s = 6;
		UasAlproNo61 (s);
	}

}
