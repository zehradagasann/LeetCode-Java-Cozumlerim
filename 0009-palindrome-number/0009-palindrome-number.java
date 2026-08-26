class Solution {
    public boolean isPalindrome(int x) {
      if(x<0){
        return false;
      }
      if(x!=0 && x%10==0){
        return false;
      }
        int orijinal=x;
        int ters=0;
        while(x>0){
            int sonBasamak=x%10;
            ters=ters*10+sonBasamak;
            x=x/10;
        }
        return orijinal==ters;
    }
}