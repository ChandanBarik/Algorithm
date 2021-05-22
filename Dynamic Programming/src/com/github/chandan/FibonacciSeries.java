/**
 * 
 */
package com.github.chandan;

/**
 * @author Chandan
 *
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
// F(n) = F(n-1)+F(n-2)
		Integer n = 20;
		Integer arrayIndices[] = new Integer[n + 1];
		arrayIndices[0] = 0;
		arrayIndices[1] = 1;
		for (Integer i = 2; i <= n; i++) {
			arrayIndices[i] = arrayIndices[i - 1] + arrayIndices[i - 2];
			System.out.println(i + "---- " + arrayIndices[i]);
		}
		System.out.println("Fibonacci Series : F[n] with n = " + n + "  is " + arrayIndices[n]);
	}

}
