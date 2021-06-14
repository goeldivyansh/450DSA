//Method 1 Time Comp O(N^2)
class Solution {
    public String longestPalindrome(String s) {
        int l = s.length();
        int a[][] = new int[l][l];
        String ans = "";
        for(int g=0;g<l;g++)
        {
            for(int i=0,j=g ; j<l ; i++,j++)
            {
                if(g==0) {
                    a[i][j] = 1;
                    ans = s.substring(i,j+1);
                    
                } 
                else
                if(g==1 && s.charAt(i) == s.charAt(j)) {
                    a[i][j] = 1;
                    ans = s.substring(i,j+1);
                }   
                else
                {
                    if(s.charAt(i) == s.charAt(j) && a[i+1][j-1] == 1)
                    {
                        a[i][j] = 1;
                    ans = s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }
}

//Method 2  Time Comp O(N^3)
class Solution{
    
    static int isPalindrome(String S) {
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
    
    static String longestPalin(String s){
        // code here
        int l = s.length();
        int length = 0;
        String ans = "";
        
        for(int i=0;i<l;i++)
        {
            for(int j=i;j<l;j++)
            {
                if(isPalindrome(s.substring(i,j+1)) == 1)
                {
                    String s1 = s.substring(i,j+1);
                    if(s1.length() > length)
                    {
                        ans = s1;
                        length = ans.length();
                    }
                }
            }
        }
        return ans;
    }
}