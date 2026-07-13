class Solution {
    public boolean isPalindrome(int x) {
    long n;
    long rev=0;
    long y=x;
    while(y>0)
    {
        n=y%10;
        rev=rev*10+n;
        y=y/10;
    }
    if(x==rev)
    return true;
    else
    return false;
    }
}