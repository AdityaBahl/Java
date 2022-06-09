public class stringmethods {
    public static void main(String[] args) {
        // equals() - compares 2 strings(case sensitive)
        // equalsIgnoreCase() - ignores case senstivities
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "Hello";
        // displaying
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        // regionMatches()-to compare subarrays of 2 strings
        System.out.println("region matches:" + s2.regionMatches(1, s1, 1, 4));
        // startswith() and endswith()
        String a = "Aditya";
        System.out.println(a.startsWith("Adi"));
        System.out.println(a.startsWith("Nand"));
        System.out.println(a.endsWith("tya"));
        System.out.println(a.endsWith("att"));
        // note - use equals() instead of == because equals compares the content inside
        // the string objects and == checks whether the 2 strings are same instance or
        // no

        // note - string.toLowerCase() - converts string to lowercase
        // string.toUpperCase() - converts string to Uppercase
        // string.replace('x','y') - replaces all occurences of x with y
        // string.trim() - removes whitespaces at beginning and end of string
        // string.equals(string2) - already discussed
        // string.equalsIgnoreCase(string2) - already discussed
        // string.length() - gives string length
        // string.CharAt(n) - gives nth character in a string
        // string1.compareTo(string2) - returns negative if string1<string2 and positive
        // for string1>stirng2 and 0 for equal
        // string1.concat(string2) - concatinates string 1 and 2
        // string.substring(n) or (n,m) - n to eol, or till m
        // string.indexof('x') - first occurence of x
        // string.indexof('x',n) - first occurence of x after n
        // toString() - converts instance variable to string

    }
}
