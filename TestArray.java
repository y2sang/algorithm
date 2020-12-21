import java.util.*;
public class TestArray {
    public static void main(String args[]) { 
        List<String> strList = new ArrayList<String>();
        strList.add("aaa@bb.com");
        strList.add("bbb@cc.com");
        System.out.println(String.join(";", strList));

    }
}
