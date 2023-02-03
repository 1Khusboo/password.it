public class bubble{
    public static void main(String[] args){
        // bubble ob=new bubble();
        int arr[]={3,7,1,2,8,5,6,4,9,2,4};
        int n=arr.length;
        sort(arr,n);
        printArray(arr,n);
    }
    public static void sort(int arr[],int n){
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArray(int arr[],int n){
            for(int i=0;i<n;++i){
                System.out.print(arr[i]+" ");
            }
        }
}

    