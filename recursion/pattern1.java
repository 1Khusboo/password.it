public class pattern1{
    public static void main(String[] args){
        pattern5(5);
    }
    // public static void pattern(int n){
    //     for(int row=1;row<=n;row++){
    //         for(int col=1;col<=row;col++){
    //             System.out.print(col+" ");
    //         }
    //         System.out.println("");
    //     }
    // }
    // public static void pattern2(int n){
    //     for(int row=1;row<2*n;row++){
    //         int c=row>n?2*n-row:row;
    //         for(int col=1;col<=c;col++){
    //             System.out.print("* ");
    //         }
    //         System.out.println("");
    //     }
    // }
    // public static void pattern3(int n){
    //     for(int row=1;row<=n;row++){
    //         for(int space =0;space<=n-row;space++){
    //             System.out.print("  ");
    //         }
    //         for(int col=row;col>=1;col--){
    //             System.out.print(col+" ");
    //         }
    //         for(int col=2;col<=row;col++){
    //             System.out.print(col+" ");
    //         }
    //         System.out.println(" ");
    //     }
    // }
    public static void pattern4(int n){
        for(int row=1;row<=2*n;row++){
            int c=row>n?2*n-row:row;
            for(int space =0;space<n-c;space++){
                System.out.print("  ");
            }
            for(int col=c;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=c;col++){
                System.out.print(col+" ");
            }
            System.out.println(" ");
        }
    }
    public static void pattern5(int n){
        for(int row=1;row<=2*n;row++){
            int c=row>n?2*n-row:row;
            for(int space=0;space<n-c;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=c;col++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
