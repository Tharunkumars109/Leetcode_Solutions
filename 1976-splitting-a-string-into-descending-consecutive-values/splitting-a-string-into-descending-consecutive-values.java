class Solution {
    public boolean splitString(String s) {
        for(int i = 1; i <= (s.length() / 2)+1; i++){
            int index = 0, width = i; 
            Long prev = Long.MAX_VALUE;
            while(index < s.length()){ 
                long ten = (long)Math.pow ( 10, i-1); 
                if(i > 1 && prev == ten) width--;
				
                String next = getDigit(index, s, width);
                long val = Long.parseLong(next);
				
                if(index != 0 && prev - val != 1) break; // 
                
                index += next.length();
			
                if(prev != Long.MAX_VALUE && index >= s.length()) return true;
                prev = val;
            }
        }
        return false;
    }
    
    public String getDigit(int i, String s, int len){
        int digits = 0;
        int j = i;
        while(j < s.length() && s.charAt(j) == '0') j++;
        return s.substring(i, Math.min(j+len, s.length()));
    }
}