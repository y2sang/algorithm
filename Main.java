import java.util.*;
class Cal {
  public int sort(int repeat, int[] arr, int max){
    int rtn = 0;
    Arrays.sort(arr);
    int firstVal = arr[arr.length -1];
    int secondVal = arr[arr.length -2];
    int cnt = 0;
    while (cnt < repeat){
      for (int j=0; j<max; j++){
        System.out.println(firstVal);
        cnt = cnt + 1;
        rtn = rtn + firstVal;
      }
      cnt = cnt + 1;
      rtn = rtn + secondVal;
    }
    return rtn;
    
  }
}
class Main {  
  public static void main(String args[]) { 
    Cal cal = new Cal();
    int result = cal.sort(8, new int[]{2, 4, 5, 4, 6}, 3);
    System.out.println(result);
  } 
}