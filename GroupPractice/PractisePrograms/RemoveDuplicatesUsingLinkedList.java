package Interview_Practise;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveDuplicates{
    public static void main(String[] args) {
        int arr[]={5,10,2,8,5,9,10,3,5,6};

        LinkedList<Integer>list = new LinkedList<>();
        for(int nums : arr){
            if(!list.contains(nums)){
                list.add(nums);
            }
        }
        int afterRemoved[]=new int[list.size()];
        int index=0;
        for(int nums : list){
            afterRemoved[index++]=nums;
        }
        System.out.println("After Removed : " + Arrays.toString(afterRemoved));
    }
}