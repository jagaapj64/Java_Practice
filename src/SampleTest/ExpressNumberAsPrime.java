package SampleTest;

public class ExpressNumberAsPrime {

	public static void main(String[] args) {

//		https://www.programiz.com/java-programming/examples/sum-prime-numbers#:~:text=Working%20of%20Program,i%20is%20prime%20or%20not.
		int num = 54;

		boolean flag = false;
		int temp = num;
		for (int i = 2; i <temp; i++) {

			if (checkPrimeNum(i)) {
				if (checkPrimeNum(num - i)) {
					flag = true;
					System.out.println(num - i + "+" + i + "=" + num);
				}
			}
		}
		if (!flag)
			System.out.println(num + " cannot be expressed as the sum of two prime numbers.");

	}

	private static boolean checkPrimeNum(int num) {
		boolean isPrime = true;
		int tempPrime = num;
		for (int i = 2; i < tempPrime; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;

	}

}
