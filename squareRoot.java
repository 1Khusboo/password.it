public class squareRoot{
    public static void main(String[] args){
        int x=36;
        System.out.println(root(x));
    }
    static int root(int x){
        long start =1,end=x;
        long ans=0;
        while(start<=end){
            long mid=(start+end)/2;
            if(mid*mid==x){
            return (int)mid;
        }
        if(mid*mid<x){
            start=mid+1;
            ans=mid;
        }
        else{
            end=mid-1;
        }
        }
        
        return (int)ans;
    }
}