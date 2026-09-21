class Solution {
    public void reverseString(char[] s) {
        int Right = s.length-1;
        for(int Left=0;Left<s.length-1;Left++){
            if(Left<=Right){
            char temp =s[Left];
            s[Left]=s[Right];
            s[Right]=temp;
            Right--;
            }
        }
    }
}