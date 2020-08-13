class Solution {
    public int climbStairs(int n) {
        if ( n==1 )
            return 1;
        int sol[] = new int[n+1];
        sol[1] =1;
        sol[2] =2;
        for (int i =3; i<n;i++){
            sol[i] = sol[i-1]+sol[i-2];
            
        }
        return sol[n];
    }
}