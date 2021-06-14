class Solution {
    int isPlaindrome(String S) {
        // code here
        int f=0,l = S.length()-1;
        while(f<l)
        {
            if(S.charAt(f) != S.charAt(l))
            {
                return 0;
            }
            f++;
            l--;
        }
        return 1;
    }
};