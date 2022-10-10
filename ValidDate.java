import java.util.Scanner;
import java.util.regex.*;
public class ValidDate {
    public static void main(String[]args)
    {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter date in yyyy mm dd: ");
        String date = s.next();
        String regx = "^[0-9]+\\w[0-9]+\\w[0-9]+";
        
        Pattern p = Pattern.compile(regx);
        Matcher m = p.matcher(date);
        System.out.println(m.matches());
    }
}
