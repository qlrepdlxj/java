package jp.co.bbreak.sokusen._1._4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalSample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal value1 = new BigDecimal("0.7");
		BigDecimal value2 = new BigDecimal("0.1");
		BigDecimal result = value1.add(value2);
		System.out.println("[1] 0.7 + 0.1 = " + result);
		
		result = value1.subtract(value2);
		System.out.println("[2] 0.7 - 0.1 = " + result);
		
		result = value1.multiply(value2);
		System.out.println("[3] 0.7 x 0.1 = " + result);
		
		value1 = new BigDecimal("7.0");
		value2 = new BigDecimal("3.0");
		result = value1.divide(value2, 0, RoundingMode.DOWN);
		System.out.println("[4] 7.0 / 3.0 = " + result);
		
		value1 = new BigDecimal("7.0");
		value2 = new BigDecimal("3.0");
		result = value1.remainder(value2);
		System.out.println("[4] 7.0 % 3.0 = " + result);
	}

}
