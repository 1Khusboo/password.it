public class pattern2{
    public static void main(String[] args){
        int n=4;
        pattern(n);
    }
    public static void pattern(int n){
        int originalno=n;
        n=2*n;

        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int index=originalno-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(index+" ");
            }
            System.out.println("");
        }
    }
}
