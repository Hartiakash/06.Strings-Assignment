package String_Assignment;

/**
 * @author JALA Academy
 * Website Reference : https://java.jalaacademy.com/java/java_strings.html
 *
 * Strings Assignment 01 - 14 Problems
 */

public class Strings {

    public static void main(String[] args) {

// 1. Different ways creating a string
        String s1 = "This is a string";
        // Creating a string literal and placed in memory "string constant pool"
        System.out.println(s1);

        //new instance is created (SCP and Heap) along with one reference.
        String s2 = new String("Creating a string object and placed in memory \"Heap\"");
        System.out.println(s2);


// 2. Concatenating two strings using + operator
        String sc1 = "This String is ";
        String sc2 = "Concatenated";
        String con = sc1 + sc2; //Concatenating
        System.out.println(con);


// 3. Finding the length of the string
        String sl = "String Length";
        //The length() method returns the value of string length including white spaces
        int len = sl.length();
        System.out.println("String Length : " + len);


// 4. Extract a string using Substring
        String es = "Extracting string";
        //extracting a substring using substring() method
        //pass the start and end indexes
        String sub = es.substring(2, 10);
        System.out.println("Extracted string : " + sub);


// 5. Searching in strings using indexOf()
        String si = "Searching index";
        //The indexOf() method returns the position of first occurrence of character
        int i1 = si.indexOf("index");
        //first occurrence of the letter "e", start from index 3
        int i2 = si.indexOf("h", 3);
        System.out.println("At Index : " + i1);
        System.out.println("At Index : " + i2);


// 6. Matching a String Against a Regular Expression With matches()
        String ms = "Matching a String";
        // Testing if regex is present or not
        boolean match = ms.matches("(.*)String(.*)");
        //Boolean value, returns true if matches else false
        System.out.println("Matches : " + match);


/* 7. Comparing strings using the methods equals(), equalsIgnoreCase(),
      startsWith(), endsWith() and compareTo()
 */
        String cs1 = "Comparing strings";
        String cs2 = "Comparing strings";

        //two strings are compared using equals() method
        boolean e = cs1.equals(cs2);
        System.out.println("Equal : " + e);

        //equalsIgnoreCase() method ignores case differences
        boolean eic = cs1.equalsIgnoreCase(cs2);
        System.out.println("Equal(ignore case) : " + eic);

        //startsWith() method checks string begins
        boolean sw = cs1.startsWith("Comp");
        System.out.println("Starts with : " + sw);

        //endsWith() method checks string ending
        boolean ew = cs1.endsWith("ings");
        System.out.println("Ends with : " + ew);

        //compareTo() method returns 0 if both are equal
        int ct = cs1.compareTo(cs2);
        System.out.println("Compared : " + ct);


// 9. Trimming strings with trim()
        String ts = "   Trimming String  ";
        //trim method() Removes leading and trailing spaces
        String trm = ts.trim();
        System.out.println("Trimmed : " + trm);


// 10. Replacing characters in strings with replace()
        String rs = "Replacing string";
        //replace() method, replaces all occurrences of 'g' to 'n'
        String rpl = rs.replace("g", "n");
        System.out.println("Replaced : " + rpl);


// 11. Splitting strings with split()
        String ss = "Splitting String";
        //split() method breaks a given string around matches
        String[] spl = ss.split(" "); //splits space

        for (String i : spl) {
            System.out.println("Splitted : " + i);
        }


// 12. Converting Numbers to Strings with valueOf()
        int ns = 11;
        //valueOf() method converts different types of values into string.
        String nTs = String.valueOf(ns);
        System.out.println("Converted Num to Str : " + nTs + 22);


// 13. Converting integer objects to Strings
        int is = 11;
        //Integer.toString() method converts int to str
        String iTs = Integer.toString(is);
        System.out.println("Converted int to str : " + iTs + 33);


// 14. Converting to uppercase and lowercase
        String a = "upper case";
        String b = "LOWER CASE";
        //toUpperCase() method converts lower to upper case
        String c = a.toUpperCase();
        //toLowerCase() method converts upper to lower case
        String d = b.toLowerCase();
        System.out.println("Converted to upper case : " + c);
        System.out.println("Converted yo lower case : " + d);
    }
}
