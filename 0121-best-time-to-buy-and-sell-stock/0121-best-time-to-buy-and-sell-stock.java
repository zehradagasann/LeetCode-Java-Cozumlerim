class Solution {
    public int maxProfit(int[] prices) {
        int enUcuzFiyat = Integer.MAX_VALUE; 
        int maxKar = 0;

        for (int i = 0; i < prices.length; i++) {  
            if (prices[i] < enUcuzFiyat) {
                enUcuzFiyat = prices[i];
            } 

            else if (prices[i] - enUcuzFiyat > maxKar) {
                maxKar = prices[i] - enUcuzFiyat;
            }
        }
    
        return maxKar;
    }
}