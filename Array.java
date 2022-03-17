import java.util.*;
class Array{
    public static void main(String args[]){
        int n = 5;
        int[] arr = new int[]{ 1, 3,-1,2,-3};
        int res=0;
        int s=0;
        for(int i = 0;i<n;i++){
            s=0;
            s+=arr[i];
            if(s<0){
                res++;
            }
            for(int j=i+1;j<n;j++){
                s+=arr[j];
                if(s<0){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}