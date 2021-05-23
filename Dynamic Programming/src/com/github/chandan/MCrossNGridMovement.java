/**
 * 
 */
package com.github.chandan;

/**
 * @author ChandanKu
 *
 */
public class MCrossNGridMovement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
// total number of ways to reach  a position [m,n] in a matrix starting from [1,1]
	// movement will either be right or down.  	
		//F[m,n] = F[m-1,n] + F[m,n-1]
		// The movement for m,n grid is  - right + f[m,n-1] or down + f[m-1,n]
		
		// example for 3,3
		// right-right-down-down
		// r-d-d-r
		//r-d-r-d
		
		//d-r-r-d
		//d-r-d-r
		//d-d-r-r
		
		// that is total number of ways from the point directly right to the start point + total number of ways from the point down to the start point
		
		
		// base cases == f[1,n] =1 and f[m,1] = 1
		int m=4;
		int n=4;
		int [][] result= new int[m+1][n+1];
		
		result[0][0]=1;
		
		for(int j=1;j<=n;j++) {
			result[1][j]=1;
		}
		
		for(int i=1;i<=m;i++) {
			result[i][1]=1;
		}
		
		for(int i=2;i<=m;i++) {
			for(int j=2;j<=n;j++) {
				result[i][j]=result[i-1][j]+ result[i][j-1];
			}
		}
		
		System.out.println("Number of ways are "+ result[m][n]);
	}

}
