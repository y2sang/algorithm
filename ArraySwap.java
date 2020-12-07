import java.util.*;

public class ArraySwap {
    public void cal(int m, int k, Integer[] arr, Integer[] arr2){
        
        Arrays.sort(arr);        
        Arrays.sort(arr2, Collections.reverseOrder());
        
        for(int i=0;i<k;i++){
            if(arr[i] < arr2[i]){
                arr[i] = arr2[i];
            }
        }
        
        int sum = 0;
        for(Integer val : arr){            
            System.out.print(val + ",");
            sum = sum + val;
        }
        System.out.println();
        System.out.println(sum);

    }

    public static void main(String args[]) { 
        /*
            5 3
            1 2 5 4 3
            5 5 6 6 5
    
        */
        ArraySwap mtd = new ArraySwap();
        mtd.cal(5, 3, new Integer[]{1,2,5,4,3}, new Integer[]{5,5,6,6,5});
    }
}


