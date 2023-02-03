public class armstrong{
    public static void main(String[] args){
        int n=123;
        int number=arm(n);
         if(number==n){
             System.out.print(number+" is an Armstrong number");
         }else{
             System.out.print(number+" is Not a Armstrong number");
         }
    }
    public static int arm(int n){
        int cube=0;
        int rem;
        while(n>0){
            rem= n%10;
            cube=cube+rem*rem*rem;
            n /=10;
        }
        return cube;
    }
}