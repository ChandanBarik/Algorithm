/**
 * 
 */
package com.github.chandan;

/**
 * @author Chandan
 *
 */
public class ShareMarketProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Given an array of price of a stock on subsequent days, find the max profit
		 * possible of buying once and selling once over that period
		 * 
		 * to find for a given day of selling, the minimum stock price from day 0 to
		 * that day
		 * 
		 */

		int[] stockPrices = new int[] { 8, 1, 3, 4, 6, 3 };

		int numberOfDays = stockPrices.length;

		int[] minPrice = new int[numberOfDays];

		minPrice[0] = stockPrices[0];
		for (int i = 1; i < numberOfDays; i++) {
			minPrice[i] = stockPrices[i] < minPrice[i - 1] ? stockPrices[i] : minPrice[i - 1];
			System.out.println(" minPrice[" + i + "] " + minPrice[i]);
		}

		int[] maxProfitOnADay = new int[numberOfDays];

		int maxProfit = Integer.MIN_VALUE;
		for (int i = 0; i < numberOfDays; i++) {
			maxProfitOnADay[i] = stockPrices[i] - minPrice[i];
			maxProfit = maxProfit > maxProfitOnADay[i] ? maxProfit : maxProfitOnADay[i];
			System.out.println(" maxProfitOnADay[" + i + "] " + maxProfitOnADay[i]);
		}

		System.out.println("Max Profit is " + maxProfit);
	}

}
