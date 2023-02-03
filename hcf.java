public class hcf{
    public static void main(String[] args){
        System.out.println("HCF is " +gcd(10,20));
        System.out.println("LCM is "+lcm(10,20));
    }
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(a%b,a);
    }
    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
}