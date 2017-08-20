
public class DetectCapital_520 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetectCapital_520 dc = new DetectCapital_520();

		dc.detectCapitalUse("FlaG");
	}

	public boolean detectCapitalUse(String word) {
		boolean f = false;
		boolean s = false;

		if (word.length() == 1) {
			return true;
		}

		char[] c = word.toCharArray();
		if ((int) c[0] >= 65 && (int) c[0] <= 90) {
			f = true;
		}
		if ((int) c[1] >= 65 && (int) c[1] <= 90) {
			s = true;
		}

		if (!f && s) {
			return false;
		}

		for (int i = 2; i < c.length; i++) {
			// upper case
			if (90 >= (int) c[i] && (int) c[i] >= 65) {
				if ((!f && !s) || (f && !s))
					return false;
			} else {
				// lower case
				if (f && s)
					return false;
			}

		}

		return true;
	}

}
