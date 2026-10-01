package Infosys.DP;

import java.util.Arrays;

public class Coins {

	public static int changeCoin(int[] coins, int amount) {
		
		
		int dp[] = new int[amount+1];
		Arrays.fill(dp,amount+1);
		
		dp[0] = 0;
		
		for(int i =1; i<=amount;i++) {
			for(int coin: coins) {
				if(i-coin >= 0) 
				{
					dp[i]= Math.min(dp[i],dp[i-coin]+1);
				}
			}
		}
		if(dp[amount]> amount) {
			return -1;
		}else {
		
		
		return dp[amount] ;
	}
	}
	public static void main(String[] args) {
		int coins[] = {3,4,5,6};
		
		System.out.println(changeCoin(coins, 1));
		
	
		
	}
}
