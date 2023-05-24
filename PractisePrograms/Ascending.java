package Testing;

public class Ascending {
    public static void main(String[] args) {
        int arr[]={5,4,6,7,2,4,9};
        int temp=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
        }
        System.out.println("The Ascending Numbers : ");
        for (int number : arr) {
            System.out.println(number);
        }
        
    }
}
