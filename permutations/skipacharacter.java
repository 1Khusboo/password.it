public class skipacharacter{
    public static void main(String[] args){
        System.out.println(skip("Nappleikhil Sharapplema"));
    }
    public static String skip(String up){
        if(up.isEmpty()){
            return" ";
        }
        // char ch=up.charAt(0);
        if(up.startsWith("apple")){
            return skip(up.substring(5));
        }else{
            return up.charAt(0)+skip(up.substring(1));
        }
    }
}
