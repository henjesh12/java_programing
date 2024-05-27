class Solution
{ 
    public static int findSum(int A[],int N) 
    {
     int min=A[0];
     int max=A[0];
     for(int i=0;i<N;i++){
         if(min>A[i]){
             min=A[i];
             
         }
         if(max<A[i]){
             max=A[i];
         }
     }
    int sum=max+min;
    return sum;
}
}