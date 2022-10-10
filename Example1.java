import java.util.Scanner;
import java.util.regex.*;
class Example1
{
    public static void main(String[]args)
    {
        // Pattern pattern = Pattern.compile(".xx.");
        // Matcher m = pattern.matcher("1xx2"); 
        // System.out.println("Pattern Matches: "+m.matches());

        // System.out.println(Pattern.matches("[xyz]{3}","xxxyyyzzz"));
        // System.out.println(Pattern.matches("[wxz]","z"));

        // System.out.println(Pattern.matches("\\d","1"));
        // System.out.println(Pattern.matches("\\D","a"));
        // System.out.println(Pattern.matches(".", "2"));
        // System.out.println(Pattern.matches(".", "a"));
        // System.out.println(Pattern.matches(".", "AASD"));
        // System.out.println(Pattern.matches("\\s"," "));//white space
        // System.out.println(Pattern.matches("\\S", "a"));//anti white space
        // System.out.println(Pattern.matches("\\w", "1"));//any word character[a-zA-Z0-9]
        // System.out.println(Pattern.matches("\\W", " "));
        // System.out.println(Pattern.matches(".", "2"));
        // System.out.println(Pattern.matches("\\b", "Hello there"));//Represents word boundary (similarly non word boundary)

        Scanner s = new Scanner(System.in);

        boolean found = false;
        System.out.println("Enter a regex: ");
        String regex = s.next();

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("Welcome to youtube");
        while(m.find())
        {
            System.out.println("Found the regex : "+m.group()+"\nStarting at : "+m.start()+"\nEnding at : "+m.end());
            found = true;
        }
        if(!found)
        {
            System.out.println("Not found");
        }

        
        

        

    }   
}