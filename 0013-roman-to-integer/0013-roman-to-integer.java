class Solution {
    public int romanToInt(String s) {
        
        int toplam = 0;
        
        
        for (int i = 0; i < s.length(); i++) {
            
            int simdiki = getValue(s.charAt(i));
            
            
            if (i + 1 < s.length() && simdiki < getValue(s.charAt(i + 1))) {
                toplam -= simdiki;
            } else {
                toplam += simdiki;
            }
        }
        
        return toplam;
    }
    
    private int getValue(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:  return 0;
        }
    }
}