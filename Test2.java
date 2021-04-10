import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String args[]) { 
        Pattern pattern = Pattern.compile("<form|form['\"()]|location.");
        Matcher match = pattern.matcher(">5form");
        if(match.find()){
            System.out.println("Found");
        } else {
            System.out.println("NO Found");
        }
    }
}
