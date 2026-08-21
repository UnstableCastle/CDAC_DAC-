package PREP;
import java.util.*;
public class StockMarketBot {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int[] prices = new int[n];
	
	for(int i=0;i<n;i++) {
		prices[i] = sc.nextInt();
	}
	
	int lowestPrice = Integer.MAX_VALUE;
	int maxProfit =0;
	
	for(int i = 0;i<n;i++) {
		int currentPrice = prices[i];
		
	if(currentPrice<lowestPrice) {
		lowestPrice=currentPrice;
	}
	else {
		int profit = currentPrice-lowestPrice;
		if(profit > maxProfit) {
			maxProfit = profit;
		}
	}
	
	}
	System.out.println(maxProfit);
	sc.close();
		
}
}
