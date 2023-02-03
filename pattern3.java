public class pattern3{
    public static void main(String[] args){
        p3(10);
    }
    public static void p3(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}