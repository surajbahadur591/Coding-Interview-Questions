
class Solution {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i<A.length; i++)
            A[i ] = A[i]*A[i];
        Arrays.sort(A);
        return A;
    }
}


class Solution {
    public int[] sortedSquares(int[] A) {
        int B[] = new int[A.length];
        int start= 0, end = A.length-1, index=B.length-1;
        
        while (start<=end){
            if(abs(A[start]) > abs(A[end])){
                B[index] = square(A[start]);
                start++;
            }
            else {
                B[index] =square(A[end]);
                end--;
            }
        index--; 
    }
        return B;
    }
    public static int abs(int number) {
    return number >= 0 ? number : -1 * number;  // coverting negative to positive number
}
    public static int square(int number) {
    return number * number;
}

}