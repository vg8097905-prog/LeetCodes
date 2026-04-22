class Solution {
    public int reverse(int x) {
        long rev=0;
        int ans=x;
        while(x!=0){
            int d=x%10;
            rev=rev*10+d;//multiply shifting
            x=x/10;
           
        }
         if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
       return  (int) rev;
    }
        
}