public class insertion{
    public static void main(String[] args){
        int arr[]={3,1,5,2,8,5,4};
        int n=arr.length;
        insertion(arr,n);
        printArray(arr,n);
    }
    public static void insertion(int arr[],int n){
        int j,key;
        for(int i=1;i<=n-1;i++){
            j=i-1;
            key=arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}