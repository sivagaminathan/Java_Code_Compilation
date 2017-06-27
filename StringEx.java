package StringEx;

// Some String work-examples I did

public class StringEx {

	// String is immuatable, it means u cant do S++
	// Each ++ will create new strings
	// SO use either StringBuilder or StringBuffer

	public static String reverseSentenceWords(String S) {
		String[] arr = S.split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[arr.length - i - 1]).append(" ");
		}

		return sb.toString();
	}

	public int lastIndexOfUCL(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			if (Character.isUpperCase(str.charAt(i))) {
				return i;
			}
		}
		return -1;
	}

	// Tried to find Capitals and return it in a string
	public String Capitals(String S) {
		String Caps = " ";
		int len = S.length();
		for (int i = 0; i < len; i++) {
			if (Character.isUpperCase(S.charAt(i))) {
				char w = S.charAt(i);
				Caps = Caps + w + " ";
			}
		}
		return Caps;
	}

	// Prints First to Second Capital
	public static void FirstSecondCap(String N) {

		int firstcapital = 0;
		int secondcapital = 0;
		int j = 0;
		for (int i = 0; i < N.length(); i++) {
			if (Character.isUpperCase(N.charAt(i))) {
				// We encounter the first capital here
				if (firstcapital == 0) {
					firstcapital = 1;
					// System.out.println(N.charAt(i));
				}
				// Second capital is encountered here
				// It means our code need not run any further
				// You can also use a break
				else if (firstcapital == 1) {
					// This print prints the second capital letter
					// This loop comes true for all if firstcapital is not set
					// to value other than 0
					System.out.println(N.charAt(j));
					// Break exits the loop and no longer runs the for loop
					// Saves time but bad coding
					// break;
					firstcapital = -1;
					secondcapital = 1;
				}

			}
			// Between First capital and second capital
			if (firstcapital == 1 && secondcapital == 0) {
				// This print does not print the second capital
				// So it is handled in else if statement
				System.out.print(N.charAt(j));
			}
			// We print all indexes between First capital and second
			// If we want only capitals, print indexes "i"
			j++;

		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Take a look at JAVA String API
		// To know more methods available
		String S = "This is for Sparta!";
		String a[] = S.split(" ");

		System.out.println("Third word is : " + a[2]);

		// A Static method is always called with CLASS and not INSTANCE
		// StringEx.method() is correct
		// StringEx ex = new StringEX();
		// ex.method() is not correct

		System.out.println("Reverse: " + StringEx.reverseSentenceWords(S));

		// String DOUBLE conversion
		double d1 = 35.6;
		String sd = String.valueOf(d1);
		double d2 = new Double(d1).doubleValue();
		// --------------------------------------
		String Caps = " ";
		String N = "this Is for Sparta!";
		String F = "abdcDop5678HhhdkKLPLPL0oi";

		// Prints First capital to Second Capital
		StringEx.FirstSecondCap(N);
		StringEx.FirstSecondCap(F);
	}

	// String b[] = Caps.split(" ");
	// System.out.println(" First and Second Capital letters from *- " + S + "
	// -* are : " + b[2] + " " + b[3]);

}
