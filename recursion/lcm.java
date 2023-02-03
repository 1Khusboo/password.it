public class lcm{
    public static void main(String[] args){
        System.out.println(lcmN(10,20));
    }
    public static int hcf(int a,int b){
        if(b==0){
            return a;
        }
        if(a==0){
            return b;
        }
            return hcf(a%b,a);
    }
    public static int lcmN(int a,int b){
        return (a*b)/hcf(a,b);
    }
    
}