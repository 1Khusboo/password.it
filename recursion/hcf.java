public class hcf{
    public static void main(String[] args){
        System.out.println(hcf(90,67));
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
    
}