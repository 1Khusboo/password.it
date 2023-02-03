public class factors{
    public static void main(String[] args){
        int x=20;
        factor(x);
    }
    public static void factor(int x){
        for(int i=1;i<=x;i++){
            if(x%i==0){
                System.out.print(i+" ");
            }
        }
    }
}