class Solution {
    public int countDigits(int num) {
        int value=num;
        int count=0 ;
       while(num!=0){
         int d=num%10;
         if(value%d==0)
         count+=1;
         num=num/10;
       }
       return count;
     }
}   
      
        