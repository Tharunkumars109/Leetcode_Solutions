class Solution {
    public int nthUglyNumber(int n) {
        int[] uglynumbers=new int[n];
        uglynumbers[0]=1;
        int i2=0,i3=0,i5=0;
        int next2=2;
        int next3=3;
        int next5=5;
        int next=1;
        for(int i=1;i<n;i++)
        {
            next=Math.min(next2,Math.min(next3,next5));
            uglynumbers[i]=next;
            if(next==next2)
            {
                i2++;
                next2=uglynumbers[i2]*2;
            }
             if(next==next3)
            {
                i3++;
                next3=uglynumbers[i3]*3;
            }
             if(next==next5)
            {
                i5++;
                next5=uglynumbers[i5]*5;
            }
        }
    
    return uglynumbers[n-1];
    }
}