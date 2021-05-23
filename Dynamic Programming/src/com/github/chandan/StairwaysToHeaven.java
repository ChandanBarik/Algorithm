/**
 * 
 */
package com.github.chandan;

/**
 * @author ChandanKu
 *
 */
public class StairwaysToHeaven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// You can reach the heaven through stairs either by taking one step or two step at a time
		// to find the number of ways to reach heave
		// Ex - stair of 3 steps = [1,1,1], [1,2],[2,1]
		// stair of 4 steps = [1,1,1,1], [1,2,1],[2,1,1]   -- [1,1,2],[2,2]
		//that is F[n] = one steps extra each from F[n-1] + 2 steps extra each from F[n-2]
	
		
		// F[n] = F[n-1] + F[n-2]
		
		// F[1]=1
		// F[2]=2
		
		//F[3]= f[1]+f[2]
		
		Integer n = 6;
		Integer arrayIndices[] = new Integer[n + 1];
		arrayIndices[1] = 1;
		arrayIndices[2] = 2;
		for (Integer i = 3; i <= n; i++) {
			arrayIndices[i] = arrayIndices[i - 1] + arrayIndices[i - 2];
			System.out.println(i + "---- " + arrayIndices[i]);
		}
		System.out.println("Stair Ways to Heaven : F[n] with n = " + n + "  is " + arrayIndices[n]);

	}

}
