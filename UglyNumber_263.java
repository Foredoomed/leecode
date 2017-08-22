
public class UglyNumber_263 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isUgly(int num) {
		if (num == 1) {
			return true;
		}

		if (num < 0) {
			return false;
		}

		while (num % 2 == 0)
			num = num >> 1;
		while (num % 3 == 0)
			num = num / 3;
		while (num % 5 == 0)
			num = num / 5;
		return num == 1;
	}

}
