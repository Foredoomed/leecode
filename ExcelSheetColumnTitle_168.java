
public class ExcelSheetColumnTitle_168 {
	
	public static void main(String[] args) {
		ExcelSheetColumnTitle_168 e = new ExcelSheetColumnTitle_168();
		System.out.println(e.convertToTitle(1));
	}
	
	
	public String convertToTitle(int n) {
		return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
	}
}
