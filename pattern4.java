public class pattern4{
    public static void main(String[] args){
        p4(10);
    }
    public static void p4(int n){
        for(int row=1;row<=n;row++){
            for(int space=0;space<=row;space++){
                    System.out.print(" ");
                }
            for(int col=1;col<=n-row+1;col++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}