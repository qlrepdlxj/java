package jp.co.bbreak.sokusen._1._4;

public class ArtimeticOperator1 {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 1;
		result += 2;
		System.out.println("[1] result = 1 -> result += 2 -> result = " + result);
		
		System.out.println("[2] result = 1 -> ++result");
		result = 1;
		printValue(++result);
		System.out.println("result = " + result);
		
		System.out.println("[3] result = 1 -> result++");
		result = 1;
		printValue(result++);
		System.out.println("result = " + result);
	}
	
	private static void printValue(int value) {
		System.out.println("value: value = " + value);
	}
}
