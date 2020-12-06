public class CountNumber {
    public static void main(String args[]) { 
        int count = 0;
        int hour = 5;
        for (int i=1; i<=hour + 1; i++){
            for (int j=1; j<=60; j++){
                for (int k=1; k<=60; k++){
                    String str1 = String.valueOf(i);
                    String str2 = String.valueOf(j);
                    String str3 = String.valueOf(k);
                    if(str1.indexOf("3") > -1 || str2.indexOf("3") > -1 || str3.indexOf("3") > -1){
                        count = count + 1;
                    }
                    
                }
            }
            
        }

        System.out.println(count);
        
    } 
}
