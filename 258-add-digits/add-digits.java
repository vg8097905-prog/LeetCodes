class Solution {
    public int addDigits(int num) {
        int sum;
        int d=(num - 1) % 9;
         sum=d+1;
           return sum;
    }  
}