package sample;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Division {
	
	public static final int SIGNIFICANT_DIGITS = 3; // 有効数字桁数
	
	public static void main(String[] args) {
		try {
			System.out.println(divided("10000", "3")); // 3330
			System.out.println(divided("1000", "3")); // 333
			System.out.println(divided("100", "3")); // 33.3
			System.out.println(divided("10", "3")); // 3.33
			System.out.println(divided("1", "3")); // 0.333
			System.out.println(divided("1", "30")); // 0.0333
			System.out.println(divided("1", "300")); // 0.00333
			System.out.println(divided("1", "3000")); // 0.000333
			System.out.println(divided("1", "30000")); // 0.0000333
		} catch(NumberFormatException nfe) {
			System.out.println("Error: Not a number.");
		} catch(ArithmeticException ae) {
			System.out.println("Error: Impossible to calculate.");
		} catch(Exception e) {
			System.out.println("Error: Unexpected.");
		}
	}

	public static String divided(String dividend, String divisor) throws Exception {
		BigDecimal bdDividend = new BigDecimal(dividend);
		BigDecimal bdDivisor = new BigDecimal(divisor);
		BigDecimal answer = null;
		
		try {
			// 割り切れたらそのまま割る
			answer = bdDividend.divide(bdDivisor);
		} catch(ArithmeticException arithmeticException) {
			// 割り切れない場合は有効なscaleを算出して計算（この例では丸め方は四捨五入とする）
			answer = bdDividend.divide(bdDivisor, getSignificantScale(bdDividend, bdDivisor), RoundingMode.HALF_UP);
		}
		return answer.stripTrailingZeros().toPlainString();
	}
	
	public static int getSignificantScale(BigDecimal dividend, BigDecimal divisor) {
		// 絶対値にして小数点以下の末尾のゼロを除く
		BigDecimal bd1 = dividend.abs().stripTrailingZeros();
		BigDecimal bd2 = divisor.abs().stripTrailingZeros();
		// 自然数に揃えてプレイン文字列化する
		int decimalDigits = bd1.scale() > bd2.scale() ? bd1.scale() : bd2.scale();
		if (decimalDigits < 0) decimalDigits = 0;
		String s1 = bd1.scaleByPowerOfTen(decimalDigits).toPlainString();
		String s2 = bd2.scaleByPowerOfTen(decimalDigits).toPlainString();
		// 有効なscaleを算出して返す
		return SIGNIFICANT_DIGITS - (s1.length() - s2.length()) - (s1.compareTo(s2) >= 0 ? 1 : 0);
	}
}
