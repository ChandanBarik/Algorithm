/**
 * 
 */
package com.github.chandan;

/**
 * @author ChandanKu
 *
 */
public class RodCutterProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// A rod of length n 
		// an array contains prices of smaller parts of the rod
		// find the max value that can be earned by cuttig the rod to smaller pieces
		
		/*
		 * f(4) =
		 * 
		 * 1,1,1,1 1,1,2 1,3 2,2 4
		 * 
		 * that is if first part is 1 unit, we need to take optimal solution from the
		 * remaining lenght = n-1 if first part is of lentth 2, we need to take the
		 * optimal soln from remaining length = n-2
		 * 
		 * hence f(n)= max of c(1)+ f(n-1) or c(2)+ f(n-2) .......or c(k)+f(n-k)
		 *
		 *where the c will be the array of costs
		 *
		 *f will be the optimal value of cost
		 *
		 */
		
		
		int[] c = new int[] {0,2,4,5,7};
		
		int n=4;
		int[] optimalValue= new int[n+1];
		optimalValue[0]=0;
		for(int i=1;i<=n;i++) {
			int max=0;
			for(int j=1;j<=i;j++) {
				System.out.println("for i = "+i+" and j ="+j);
				System.out.println("	Max value  is "+max);
				System.out.println("	c[j]+optimalValue[i-j] =  "+ c[j] + " + " + (optimalValue[i-j]) +  " which is " + (c[j]+optimalValue[i-j]));
				max= max > (c[j]+optimalValue[i-j]) ? max : (c[j]+optimalValue[i-j]);	
			}
			optimalValue[i]= max;
			System.out.println("Optimal Value for i = "+i + " is "+ optimalValue[i]);	
		System.out.println("--------------");
		}
		
		System.out.println("Optimum result is "+optimalValue[n]);
			
	}

}
