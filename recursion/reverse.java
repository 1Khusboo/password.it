public class reverse{
    public static void main(String[] args){
        int num=121;
        int re= reverse(num);
        System.out.println(re);
         if(re==num){
            System.out.println("Palindrome number");
        }
        else{
            System.out.print("Not a Palindrome number");
    }
    }
    public static int reverse(int num){
        int rev=0;
        int rem;
        while(num>0){ 
            rem=num%10;
            rev=rev*10+rem; 
            num /=10;      
    }
    return rev;
    }
}
